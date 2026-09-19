package com.krishmotors.pricing;

public class PricingCalculator {
  private PricingRuleCatalog ruleCatalog;

  // Constructor
  public PricingCalculator(PricingRuleCatalog ruleCatalog) {
    if (ruleCatalog == null) {
      throw new IllegalArgumentException("Pricing rule catalog cannot be null");
    }
    this.ruleCatalog = ruleCatalog;
  }
  
  // Getters
  public PricingRuleCatalog getRuleCatalog() {
    return ruleCatalog;
  }

  // Methods
  public double getBasePrice(PriceQuote quote){
    return quote.getVariant().getBasePrice();
  }
  public double calculateAccessoryTotal(PriceQuote quote){
    return quote.getAccessories().stream().mapToDouble(Accessory::getPrice).sum();
  }
  public double calculateDiscountTotal(PriceQuote quote){

    double basePrice = getBasePrice(quote);
    return quote.getDiscounts().stream().mapToDouble(discount -> discount.calculateDiscount(basePrice)).sum();
  }
  public double calculateTaxableAmount(PriceQuote quote){
    double basePrice = getBasePrice(quote);
    double accessories = calculateAccessoryTotal(quote);
    double discounts = calculateDiscountTotal(quote);
    return basePrice+accessories-discounts;
  }
  public double calculateChargeTotal(PriceQuote quote){
    double taxableAmount = calculateTaxableAmount(quote);
    return this.ruleCatalog.findRulesForVariant(quote.getVariant()).stream().mapToDouble(rule -> rule.getCharge().calculateCharge(taxableAmount)).sum();
  }
}
