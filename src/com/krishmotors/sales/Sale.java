package com.krishmotors.sales;

import com.krishmotors.pricing.PriceBreakdown;
import com.krishmotors.vehicle.Vehicle;
import com.krishmotors.customer.Customer;
import com.krishmotors.payment.Payment;
import com.krishmotors.payment.PaymentStatus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sale {
  private String saleId ;
  private Customer customer ;
  private Vehicle vehicle ;
  private PriceBreakdown priceBreakdown ;
  private LocalDate saleDate ;
  private List<Payment> payments;
  
  // Constructor
  public Sale(String saleId, Customer customer, Vehicle vehicle, PriceBreakdown priceBreakdown) {
    this.saleId = saleId;
    this.customer = customer;
    this.vehicle = vehicle;
    this.priceBreakdown = priceBreakdown;
    this.saleDate = LocalDate.now() ;
    this.payments = new ArrayList<>();
  }
  
  // Getters
  public String getSaleId() {
    return saleId;
  }
  public Customer getCustomer() {
    return customer;
  }
  public Vehicle getVehicle() {
    return vehicle;
  }
  public PriceBreakdown getPriceBreakdown() {
    return priceBreakdown;
  }
  public LocalDate getSaleDate(){
    return saleDate ;
  }
  public List<Payment> getPayments(){
    return payments;
  }

  public void addPayment(Payment payment){
    if(payment == null){
      throw new IllegalArgumentException("payment cannot be null");
    }
    payments.add(payment);
  }
  public double getTotalPaid(){
    return payments.stream().filter(p -> p.getStatus() == PaymentStatus.COMPLETED).mapToDouble(Payment::getAmount).sum();
  }
  public boolean isFullyPaid(){
    return getTotalPaid() >= priceBreakdown.getTotalPrice();
  }

}
