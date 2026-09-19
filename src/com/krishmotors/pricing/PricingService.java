package com.krishmotors.pricing;

public class PricingService {
  private PricingCalculator pricingCalculator;
  private Tax tax;
  private RegistrationCharge registrationCharge;
  private Insurance insurance;
  
  // Constructor
  public PricingService(PricingCalculator pricingCalculator, Tax tax, RegistrationCharge registrationCharge,
      Insurance insurance) {
    if(pricingCalculator == null){
      throw new IllegalArgumentException("Pricing Calculator object cannot be null");
    }
    if(tax == null){
      throw new IllegalArgumentException("Tax object cannot be null");
    }
    if(registrationCharge == null){
      throw new IllegalArgumentException("Registration Charge object cannot be null");
    }
    if(insurance == null){
      throw new IllegalArgumentException("Insurance object cannot be null");
    }

    this.pricingCalculator = pricingCalculator;
    this.tax = tax;
    this.registrationCharge = registrationCharge;
    this.insurance = insurance;
  }
  
  public PriceBreakdown generateBreakdown(PriceQuote quote){
    double basePrice = pricingCalculator.getBasePrice(quote);
    double accessoriesTotal = pricingCalculator.calculateAccessoryTotal(quote);
    double discountTotal = pricingCalculator.calculateDiscountTotal(quote);
    double taxableAmount = pricingCalculator.calculateTaxableAmount(quote);
    double gst = tax.calculateTax(taxableAmount);
    double registrationFees = registrationCharge.calculateCharge(taxableAmount);
    double insuranceAmount = insurance.getPremiumAmount();
    double totalPrice = taxableAmount + gst + registrationFees + insuranceAmount;
    return new PriceBreakdown(basePrice, accessoriesTotal, discountTotal, taxableAmount, gst, registrationFees, insuranceAmount, totalPrice);
  }
}
