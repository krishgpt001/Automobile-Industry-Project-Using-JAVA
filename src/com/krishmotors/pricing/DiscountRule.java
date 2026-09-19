package com.krishmotors.pricing;

import com.krishmotors.vehicle.VehicleVariant;

public class DiscountRule {
  private String ruleId;
  private Discount discount;
  private VehicleVariant applicableVariant;
  
  // Constructor
  public DiscountRule(String ruleId, Discount discount, VehicleVariant applicableVariant) {
    if(ruleId == null || ruleId.isBlank()){
      throw new IllegalArgumentException("Discount rule ID cannot be blank");
    }
    if(discount == null){
      throw new IllegalArgumentException("Discount cannot be null");
    }
    if(applicableVariant == null){
      throw new IllegalArgumentException("Applicable variant cannot be null");
    }

    this.ruleId = ruleId;
    this.discount = discount;
    this.applicableVariant = applicableVariant;
  }
  
  // Getters
  public String getRuleId() {
    return ruleId;
  }
  public Discount getDiscount() {
    return discount;
  }
  public VehicleVariant getApplicableVariant() {
    return applicableVariant;
  }

  // Methods
  
}
