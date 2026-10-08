package com.krishmotors.pricing;

public class PricingCalculator {
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
}
