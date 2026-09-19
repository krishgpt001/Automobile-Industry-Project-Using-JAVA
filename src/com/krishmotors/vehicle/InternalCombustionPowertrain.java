package com.krishmotors.vehicle;

public class InternalCombustionPowertrain extends Powertrain {
  private int displacement ;
  private int cylinderCount ;
  
  // Constructor
  public InternalCombustionPowertrain(String powertrainId, String powertrainName, int horsepower, int torque, FuelType fuelType, int displacement, int cylinderCount) {
    super(powertrainId ,powertrainName ,horsepower ,torque ,fuelType);
    this.displacement = displacement;
    this.cylinderCount = cylinderCount;
  }

  // Getters
  public int getDisplacement() {
    return displacement;
  }
  public int getCylinderCount() {
    return cylinderCount;
  }
}
