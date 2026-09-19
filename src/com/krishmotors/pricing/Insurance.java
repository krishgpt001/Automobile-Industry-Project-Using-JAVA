package com.krishmotors.pricing;

public class Insurance {
  private String insuranceId;
  private String provider;
  private double premiumAmount;
  
  // Constructor
  public Insurance(String insuranceId, String provider, double premiumAmount) {
    if(insuranceId == null || insuranceId.isBlank()){
      throw new IllegalArgumentException("Insurance ID cannot be blank");
    }
    if(provider == null || provider.isBlank()){
      throw new IllegalArgumentException("Provider cannot be blank");
    }
    if(premiumAmount < 0){
      throw new IllegalArgumentException("Premium Amount cannot be negative");
    }
    
    this.insuranceId = insuranceId;
    this.provider = provider;
    this.premiumAmount = premiumAmount;
  }
  
  // Getters
  public String getInsuranceId() {
    return insuranceId;
  }
  public String getProvider() {
    return provider;
  }
  public double getPremiumAmount() {
    return premiumAmount;
  }
}
