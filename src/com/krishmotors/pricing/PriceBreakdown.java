package com.krishmotors.pricing;

public class PriceBreakdown {

    private double basePrice;
    private double accessoriesTotal;
    private double discountTotal;
    private double taxableAmount;
    private double gst;
    private double registrationFees;
    private double insurance;
    private double totalPrice;

    // Constructor

    public PriceBreakdown(double basePrice,double accessoriesTotal,double discountTotal,double taxableAmount,double gst,double registrationFees,double insurance,double totalPrice) {
        this.basePrice = basePrice;
        this.accessoriesTotal = accessoriesTotal;
        this.discountTotal = discountTotal;
        this.taxableAmount = taxableAmount;
        this.gst = gst;
        this.registrationFees = registrationFees;
        this.insurance = insurance;
        this.totalPrice = totalPrice;
    }

    // Getters
    public double getBasePrice() {
      return basePrice;
    }
    public double getAccessoriesTotal() {
      return accessoriesTotal;
    }
    public double getDiscountTotal() {
      return discountTotal;
    }
    public double getTaxableAmount() {
      return taxableAmount;
    }
    public double getGst() {
      return gst;
    }
    public double getRegistrationFees() {
      return registrationFees;
    }
    public double getInsurance() {
      return insurance;
    }
    public double getTotalPrice() {
      return totalPrice;
    }
}