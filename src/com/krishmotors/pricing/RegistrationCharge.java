package com.krishmotors.pricing;

public class RegistrationCharge {
  private String chargeId;
  private String state;
  private double ratePercentage;
  
  // Constructor
  public RegistrationCharge(String chargeId, String state, double ratePercentage) {
    if(chargeId == null || chargeId.isBlank()){
      throw new IllegalArgumentException("Charge ID cannot be blank");
    }
    if(state == null || state.isBlank()){
      throw new IllegalArgumentException("State cannot be blank");
    }
    if(ratePercentage < 0){
      throw new IllegalArgumentException("Rate Percentage cannot be negative");
    }
    
    this.chargeId = chargeId;
    this.state = state;
    this.ratePercentage = ratePercentage;
  }
  
  // Getters
  public String getChargeId() {
    return chargeId;
  }
  public String getState() {
    return state;
  }
  public double getRatePercentage() {
    return ratePercentage;
  }
  
  // Method
  public double calculateCharge(double taxableAmount){
    if(taxableAmount < 0){
      throw new IllegalArgumentException("Taxable amount cannot be negative");
    }
    return taxableAmount*ratePercentage/100;
  }
}
