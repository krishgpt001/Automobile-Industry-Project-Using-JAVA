package com.krishmotors.vehicle;

public class Vehicle {
  private String vin ;
  private VehicleVariant variant ;
  private String color ;
  private int manufacturingYear ;
  private VehicleStatus status ;
  
  // Constructor
  public Vehicle(String vin, VehicleVariant variant, String color, int manufacturingYear, VehicleStatus status) {
    this.vin = vin;
    this.variant = variant;
    this.color = color;
    this.manufacturingYear = manufacturingYear;
    this.status = status;
  }

  // Getters
  public String getVin() {
    return vin;
  }
  public VehicleVariant getVariant() {
    return variant;
  }
  public String getColor() {
    return color;
  }
  public int getManufacturingYear() {
    return manufacturingYear;
  }
  public VehicleStatus getStatus() {
    return status;
  }

  // Method
  public void changeStatus(VehicleStatus status){
    this.status = status ;
  }
}
