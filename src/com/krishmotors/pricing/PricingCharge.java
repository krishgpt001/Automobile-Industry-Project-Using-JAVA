package com.krishmotors.pricing;

public class PricingCharge {
  private String chargeId;
  private String name;
  private String description;
  private ChargeType type;
  private double value;
  
  // Constructor
  public PricingCharge(String chargeId, String name, String description, ChargeType type, double value) {
    if (chargeId == null || chargeId.isBlank()) {
      throw new IllegalArgumentException("Charge ID cannot be blank");
    }

    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Charge name cannot be blank");
    }

    if (type == null) {
        throw new IllegalArgumentException("Charge type cannot be null");
    }

    if (value < 0) {
        throw new IllegalArgumentException("Charge value cannot be negative");
    }

    this.chargeId = chargeId;
    this.name = name;
    this.description = description;
    this.type = type;
    this.value = value;
  }

  // Getters
  public String getChargeId() {
    return chargeId;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public ChargeType getType() {
    return type;
  }
  public double getValue() {
    return value;
  }

  // Methods
  public double calculateCharge(double amount){
    if(this.type == ChargeType.PERCENTAGE){
      return amount*value/100 ;
    }
    return value;
  }
}
