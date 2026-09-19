package com.krishmotors.specification;

public class SafetyFeatures {
 private int airbagCount ; 
 private boolean abs ;
 private boolean tractionControl ;
 private boolean electronicStabilityControl ;
 private boolean parkingSensors ;
 private boolean rearCamera ;
 
 // Constructor
 public SafetyFeatures(int airbagCount, boolean abs, boolean tractionControl, boolean electronicStabilityControl, boolean parkingSensors, boolean rearCamera) {
  this.airbagCount = airbagCount;
  this.abs = abs;
  this.tractionControl = tractionControl;
  this.electronicStabilityControl = electronicStabilityControl;
  this.parkingSensors = parkingSensors;
  this.rearCamera = rearCamera;
 }

 // Getters
 public int getAirbagCount() {
  return airbagCount;
 }
 public boolean isAbs() {
  return abs;
 }
 public boolean isTractionControl() {
  return tractionControl;
 }
 public boolean isElectronicStabilityControl() {
  return electronicStabilityControl;
 }
 public boolean isParkingSensorAvailable() {
  return parkingSensors;
 }
 public boolean isRearCameraAvailable() {
  return rearCamera;
 }
}