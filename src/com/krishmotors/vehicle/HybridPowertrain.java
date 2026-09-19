package com.krishmotors.vehicle;

public class HybridPowertrain extends Powertrain{
  private final InternalCombustionPowertrain combustionPowertrain ;
  private final ElectricPowertrain electricPowertrain ;
  
  // Constructor
  public HybridPowertrain(String powertrainId, String powertrainName, int horsepower, int torque, FuelType fuelType, InternalCombustionPowertrain combustionPowertrain, ElectricPowertrain electricPowertrain) {
    super(powertrainId, powertrainName, horsepower, torque, fuelType);
    this.combustionPowertrain = combustionPowertrain;
    this.electricPowertrain = electricPowertrain;
  }

  // Getters
  public InternalCombustionPowertrain getCombustionPowertrain() {
    return combustionPowertrain;
  }
  public ElectricPowertrain getElectricPowertrain() {
    return electricPowertrain;
  }
  
}
