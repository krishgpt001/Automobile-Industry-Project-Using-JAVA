package com.krishmotors.pricing;

public class Accessory {
  private String accessoryId;
  private String name;
  private String description;
  private double price;
  
  // Constructor
  public Accessory(String accessoryId, String name, String description, double price) {
    this.accessoryId = accessoryId;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  // Ge tters
  public String getAccessoryId() {
    return accessoryId;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public double getPrice() {
    return price;
  }
}
