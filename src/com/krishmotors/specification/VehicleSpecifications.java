package com.krishmotors.specification;

public class VehicleSpecifications {
  private Dimensions dimensions ;
  private Performance performance ;
  private SafetyFeatures safetyFeatures ;
  
  // Constructors
  public VehicleSpecifications(Dimensions dimensions, Performance performance, SafetyFeatures safetyFeatures) {
    this.dimensions = dimensions;
    this.performance = performance;
    this.safetyFeatures = safetyFeatures;
  }

  // Getters
  public Dimensions getDimensions() {
    return dimensions;
  }
  public Performance getPerformance() {
    return performance;
  }
  public SafetyFeatures getSafetyFeatures() {
    return safetyFeatures;
  }
}
