package com.krishmotors.specification;

public class Dimensions {
  private double length ;
  private double width ;
  private double height ;
  private double wheelBase ;
  private double groundClearance ;
  
  // Constructor
  public Dimensions(double length, double width, double height, double wheelBase, double groundClearance) {
    this.length = length;
    this.width = width;
    this.height = height;
    this.wheelBase = wheelBase;
    this.groundClearance = groundClearance;
  }

  // Getters
  public double getLength() {
    return length;
  }
  public double getWidth() {
    return width;
  }
  public double getHeight() {
    return height;
  }
  public double getWheelBase() {
    return wheelBase;
  }
  public double getGroundClearance() {
    return groundClearance;
  }
  
}
