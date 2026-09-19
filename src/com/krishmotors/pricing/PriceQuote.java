package com.krishmotors.pricing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.krishmotors.customer.Customer;
import com.krishmotors.vehicle.VehicleVariant;

public class PriceQuote {
  private String quoteId ;
  private VehicleVariant variant ;
  private Customer customer ;
  private List<Accessory> accessories ;
  private List<Discount> discounts ;
  private LocalDateTime createdAt ;
  private LocalDate validUntil ;

  // Constructor
  public PriceQuote(String quoteId, VehicleVariant variant, Customer customer) {
    if(quoteId == null || quoteId.isBlank()){
      throw new IllegalArgumentException("Quote ID cannot be blank");
    }
    if(variant == null){
      throw new IllegalArgumentException("Variant cannot be null");
    }
    if(customer == null){
      throw new IllegalArgumentException("Customer cannot be null");
    }

    this.quoteId = quoteId;
    this.customer = customer;
    this.variant = variant;
    this.accessories = new ArrayList<>();
    this.discounts = new ArrayList<>();
    this.createdAt = LocalDateTime.now();
    this.validUntil = LocalDate.now().plusDays(7);
  }

  // Getters
  public String getQuoteId() {
    return quoteId;
  }
  public VehicleVariant getVariant() {
    return variant;
  }
  public Customer getCustomer() {
    return customer;
  }
  public LocalDateTime getCreatedAt(){
    return createdAt ;
  }
  public LocalDate getValidUntil(){
    return validUntil ;
  }
  public List<Accessory> getAccessories(){
    return accessories ;
  }
  public List<Discount> getDiscounts(){
    return discounts ;
  }
  
  // Methods
  public void addAccessory(Accessory accessory){
    if(accessory == null){
      throw new IllegalArgumentException("Accessory cannot be null");
    }
    this.accessories.add(accessory) ;
  }
  public void addDiscount(Discount discount){
    if(discount == null){
      throw new IllegalArgumentException("Discount cannot be null");
    }
    this.discounts.add(discount) ;
  }

  public void removeAccessory(String accessoryId){
    Accessory accessory = this.accessories.stream().filter(a -> a.getAccessoryId().equals(accessoryId)).findFirst().orElse(null);
    if(accessory == null){
      throw new IllegalArgumentException("Accessory with ID "+accessoryId+" was not found");
    }
    this.accessories.remove(accessory);
  }
  public void removeDiscount(String discountId){
    Discount discount = this.discounts.stream().filter(d -> d.getDiscountId().equals(discountId)).findFirst().orElse(null);
    if(discount == null){
      throw new IllegalArgumentException("Discount with ID "+discountId+" was not found");
    }
    this.discounts.remove(discount);  
  }

  public Optional<Accessory> findAccessory(String accessoryId){
    return this.accessories.stream().filter(a -> a.getAccessoryId().equals(accessoryId)).findFirst();
  }
  public Optional<Discount> findDiscount(String discountId){
    return this.discounts.stream().filter(d -> d.getDiscountId().equals(discountId)).findFirst();
  }

}
