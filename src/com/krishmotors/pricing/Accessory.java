package com.krishmotors.pricing;

public class Accessory {
  private String accessoryId;
  private String name;
  private String description;
  private double price;
  
  // Constructor
  public Accessory(String accessoryId, String name, String description, double price) {
    if(accessoryId == null || accessoryId.isBlank()) throw new IllegalArgumentException("Accessory Id cannot be blank");
    if(name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null");
    if(price < 0) throw new IllegalArgumentException("Price cannot be negative");
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
