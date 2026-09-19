package com.krishmotors.pricing;

import com.krishmotors.vehicle.VehicleVariant;

public class PricingRule {
  private String ruleId; 
  private PricingCharge charge;
  private VehicleVariant variant;

  // Constructor
  public PricingRule(String ruleId, PricingCharge charge, VehicleVariant variant) {
    if (ruleId == null || ruleId.isBlank()) {
      throw new IllegalArgumentException("Pricing rule ID cannot be blank");
    }
    if (charge == null) {
        throw new IllegalArgumentException("Pricing charge cannot be null");
    }
    if (variant == null) {
        throw new IllegalArgumentException("Vehicle variant cannot be null");
    }

    this.ruleId = ruleId;
    this.charge = charge;
    this.variant = variant;
  }

  // Getters
  public String getRuleId() {
    return ruleId;
  }
  public PricingCharge getCharge() {
    return charge;
  }
  public VehicleVariant getVariant() {
    return variant;
  }
}