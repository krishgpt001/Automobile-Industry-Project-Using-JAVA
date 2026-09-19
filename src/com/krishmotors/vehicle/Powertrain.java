package com.krishmotors.vehicle;

public class Powertrain {
  private String powertrainId ;
  private String powertrainName ;
  private int horsepower ;
  private int torque ;
  private FuelType fuelType ;

  // Constructor
  public Powertrain(String powertrainId, String powertrainName, int horsepower, int torque, FuelType fuelType){
    this.powertrainId = powertrainId ;
    this.powertrainName = powertrainName ;
    this.horsepower = horsepower ;
    this.torque = torque ;
    this.fuelType = fuelType ;
  }

  // Getters
  public String getPowertrainId(){
    return this.powertrainId ;
  }
  public String getPowertrainName(){
    return this.powertrainName ;
  }
  public int getHorsepower(){
    return this.horsepower ;
  }
  public int getTorque(){
    return this.torque ;
  }
  public FuelType getFuelType(){
    return this.fuelType ;
  }



}
