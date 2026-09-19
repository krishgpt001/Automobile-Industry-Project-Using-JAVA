package com.krishmotors.vehicle;

import com.krishmotors.specification.VehicleSpecifications;

public class VehicleVariant {
  private String variantId ;
  private String variantName ;
  private String description ;
  private Powertrain powertrain ;
  private TransmissionType transmissionType ;
  private VehicleSpecifications specifications ;
  private VehicleModel model;
  private double basePrice ;
  
  // Constructor
  public VehicleVariant(String variantId, String variantName, String description, Powertrain powertrain, TransmissionType transmissionType, VehicleSpecifications specifications,VehicleModel model ,  double basePrice) {
    this.variantId = variantId;
    this.variantName = variantName;
    this.description = description;
    this.powertrain = powertrain;
    this.transmissionType = transmissionType;
    this.specifications = specifications;
    this.model = model;
    this.basePrice = basePrice;
  }

  // Getters
  public String getVariantId() {
    return variantId;
  }
  public String getVariantName() {
    return variantName;
  }
  public String getDescription() {
    return description;
  }
  public Powertrain getPowertrain() {
    return powertrain;
  }
  public TransmissionType getTransmissionType() {
    return transmissionType;
  }
  public VehicleSpecifications getSpecifications() {
    return specifications;
  }
  public VehicleModel getModel(){
    return model;
  }
  public double getBasePrice() {
    return basePrice;
  }
  
}
