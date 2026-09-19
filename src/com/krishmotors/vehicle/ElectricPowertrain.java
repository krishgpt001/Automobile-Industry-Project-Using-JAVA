package com.krishmotors.vehicle;

public class ElectricPowertrain extends Powertrain{
  private double batteryCapacity ;
  private int motorCount ;
  private double chargingPower ;
  
  // Constructor
  public ElectricPowertrain(String powertrainId, String powertrainName, int horsepower, int torque, FuelType fuelType,double batteryCapacity, int motorCount, double chargingPower) {
    super(powertrainId, powertrainName, horsepower, torque, fuelType);
    this.batteryCapacity = batteryCapacity;
    this.motorCount = motorCount;
    this.chargingPower = chargingPower;
  }

  // Getters
  public double getBatteryCapacity() {
    return batteryCapacity;
  }
  public int getMotorCount() {
    return motorCount;
  }
  public double getChargingPower() {
    return chargingPower;
  }

  
  
}
