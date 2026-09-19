package com.krishmotors.sales;

import com.krishmotors.pricing.PriceBreakdown;
import com.krishmotors.vehicle.Vehicle;
import com.krishmotors.customer.Customer;
import java.time.LocalDate;

public class Sale {
  private String saleId ;
  private Customer customer ;
  private Vehicle vehicle ;
  private PriceBreakdown priceBreakdown ;
  private LocalDate saleDate ;
  
  // Constructor
  public Sale(String saleId, Customer customer, Vehicle vehicle, PriceBreakdown priceBreakdown) {
    this.saleId = saleId;
    this.customer = customer;
    this.vehicle = vehicle;
    this.priceBreakdown = priceBreakdown;
    this.saleDate = LocalDate.now() ;
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
}
