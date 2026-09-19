package com.krishmotors.pricing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.krishmotors.vehicle.VehicleVariant;

public class PricingRuleCatalog {
  private List<PricingRule> rules = new ArrayList<>();

  public void addRule(PricingRule rule){
    if(rule == null){
      throw new IllegalArgumentException("Rule provided is blankPricing rule can not be null");
    }
    rules.add(rule);
  }
  public void removeRule(String ruleId){
    PricingRule rule = this.rules.stream().filter(r -> r.getRuleId().equals(ruleId)).findFirst().orElse(null);
    if(rule == null){
      throw new IllegalArgumentException("Rule ID provided does not exists");
    }
    rules.remove(rule);
  }
  public Optional<PricingRule> findRule(String ruleId){
    return this.rules.stream().filter(rule -> rule.getRuleId().equals(ruleId)).findFirst();
  }
  public List<PricingRule> findRulesForVariant(VehicleVariant variant){
    return this.rules.stream().filter(rule -> rule.getVariant().getVariantId().equals(variant.getVariantId())).toList();
  }
}
