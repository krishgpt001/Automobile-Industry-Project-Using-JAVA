package com.krishmotors.specification;

public class Performance {
  private double topSpeed ;
  private double zeroToHundred ;
  private double mileage ;
  
  // Constructor
  public Performance(double topSpeed, double zeroToHundred, double mileage) {
    this.topSpeed = topSpeed;
    this.zeroToHundred = zeroToHundred;
    this.mileage = mileage;
  }

  // Getters
  public double getTopSpeed() {
    return topSpeed;
  }
  public double getZeroToHundred() {
    return zeroToHundred;
  }
  public double getMileage() {
    return mileage;
  } 
}
