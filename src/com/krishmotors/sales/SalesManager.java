package com.krishmotors.sales;

import java.util.ArrayList;
import java.util.List;

import com.krishmotors.inventory.InventoryService;
import com.krishmotors.pricing.PricingService;
import com.krishmotors.pricing.PriceBreakdown;
import com.krishmotors.pricing.PriceQuote;
import com.krishmotors.customer.Customer;
import com.krishmotors.vehicle.Vehicle;
import com.krishmotors.payment.Payment;
import com.krishmotors.exception.VehicleNotFoundException;
import com.krishmotors.exception.VehicleUnavailableException;
import com.krishmotors.exception.InsufficientPaymentException;

public class SalesManager {
  private InventoryService inventoryService;
  private PricingService pricingService;
  private List<Sale> completedSales;

  // Constructor
  public SalesManager(InventoryService inventoryService, PricingService pricingService) {
    this.inventoryService = inventoryService;
    this.pricingService = pricingService;
    completedSales = new ArrayList<>();
  }

  // Getters
  public List<Sale> getCompletedSales(){
    return completedSales;
  }

  // Methods
  public Sale initiateSale(String vin, PriceQuote quote,String saleId) throws VehicleNotFoundException, VehicleUnavailableException{
    inventoryService.reserveVehicle(vin);
    Customer customer = quote.getCustomer();
    Vehicle vehicle = inventoryService.getInventoryItem(vin).getVehicle();
    PriceBreakdown breakdown = pricingService.generateBreakdown(quote);
    return new Sale(saleId, customer, vehicle, breakdown);
  }

  public void recordPayment(Sale sale,Payment payment){
    sale.addPayment(payment);
  }

  public void completeSale(String vin,Sale sale) throws InsufficientPaymentException, VehicleNotFoundException{
    if(!sale.isFullyPaid()) throw new InsufficientPaymentException("Complete the full Payment first.",sale.getPriceBreakdown().getTotalPrice(),sale.getTotalPaid());
    inventoryService.markAsSold(vin);
    completedSales.add(sale);
  } 
}
