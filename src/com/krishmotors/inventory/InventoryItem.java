package com.krishmotors.inventory;

import java.time.LocalDate;

import com.krishmotors.vehicle.Vehicle;


public class InventoryItem {
  private Vehicle vehicle;
  private String location;
  private double sellingPrice;
  private LocalDate arrivedOn;

  // Constructor
  public InventoryItem(Vehicle vehicle, String location, double sellingPrice) {
    this.vehicle = vehicle;
    this.location = location;
    this.sellingPrice = sellingPrice;
    this.arrivedOn = LocalDate.now();
  }

  // Getters
  public Vehicle getVehicle() {
    return vehicle;
  }
  public String getLocation() {
    return location;
  }
  public double getSellingPrice() {
    return sellingPrice;
  }
  public LocalDate getArrivedOn() {
    return arrivedOn;
  }
  
  // Methods
  public void updateSellingPrice(double newPrice){
    if(newPrice < 0){
      throw new IllegalArgumentException("Price of Vehicle can't be negative");
    }
    this.sellingPrice = newPrice;
  }
  
}
