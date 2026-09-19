package com.krishmotors.pricing;

import java.time.LocalDate;

public class Discount {
  private String discountId;
  private String name;
  private String description;
  private DiscountType type;
  private double value;
  private LocalDate validFrom;
  private LocalDate validUntil;

  // Constructor
  public Discount(String discountId, String name, String description, DiscountType type, double value, LocalDate validFrom, LocalDate validUntil) {
    if(discountId == null || discountId.isBlank()){
      throw new IllegalArgumentException("Discount ID cannot be blank");
    }
    if(name == null || name.isBlank()){
      throw new IllegalArgumentException("Discount Name cannot be blank");
    }
    if(type == null){
      throw new IllegalArgumentException("Discount type cannot be null");
    }
    if (value < 0) {
      throw new IllegalArgumentException("Discount value cannot be negative");
    }
    if (type == DiscountType.PERCENTAGE && value >= 100) {
      throw new IllegalArgumentException("Percentage discount cannot exceed 100");
    }
    if(validFrom == null || validUntil == null){
      throw new IllegalArgumentException("Discount dates cannot be null");
    }
    if(validFrom.isAfter(validUntil)) {
      throw new IllegalArgumentException("Discount start date cannot be after end date");
    }
  
    this.discountId = discountId;
    this.name = name;
    this.description = description;
    this.type = type;
    this.value = value;
    this.validFrom = validFrom;
    this.validUntil = validUntil;
  }

  // Getters
  public String getDiscountId() {
    return discountId;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public DiscountType getType() {
    return type;
  }
  public double getValue() {
    return value;
  }
  public LocalDate getValidFrom() {
    return validFrom;
  }
  public LocalDate getValidUntil() {
    return validUntil;
  }

  // Methods
  public double calculateDiscount(double amount){
    if(type == DiscountType.PERCENTAGE){
      return amount*value/100 ;
    }
    return value ;
  }
  public boolean isValidOn(LocalDate date){
    return !date.isBefore(validFrom) && !date.isAfter(validUntil);
  }
}
