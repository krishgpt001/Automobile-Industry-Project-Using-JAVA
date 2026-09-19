package com.krishmotors.pricing;

public class Tax {
  private String taxId;
  private String name;
  private double ratePercentage;

  // Constructor
  public Tax(String taxId, String name, double ratePercentage) {
    if(taxId == null || taxId.isBlank()){
      throw new IllegalArgumentException("Tax Id cannot be blank");
    }
    if(name == null || name.isBlank()){
      throw new IllegalArgumentException("Name cannot be blank");
    }
    if(ratePercentage < 0){
      throw new IllegalArgumentException("Rate percentage cannot be negative");
    }
    
    this.taxId = taxId;
    this.name = name;
    this.ratePercentage = ratePercentage;
  }
  
  // Getters
  public String getTaxId() {
    return taxId;
  }
  public String getName() {
    return name;
  }
  public double getRatePercentage() {
    return ratePercentage;
  }
  
  // Methods
  public double calculateTax(double taxableAmount){
    if(taxableAmount < 0){
      throw new IllegalArgumentException("Taxable amount cannot be negative");
    }
    return taxableAmount*ratePercentage/100;
  }
}
