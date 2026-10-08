package com.krishmotors.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;;

public class VehicleModel {
  private String modelId ;
  private String modelName ;
  private String description ;
  private VehicleCategory category ;
  private List<VehicleVariant> variants ;

  // Constructor 
  public VehicleModel(String modelId,String modelName,String description,VehicleCategory category){
    this.modelId = modelId ;
    this.modelName = modelName ;
    this.description = description ;
    this.category = category ;
    this.variants = new ArrayList<>() ;
  }

  // Getters
  public String getModelId(){
    return this.modelId ;
  }
  public String getModelName(){
    return this.modelName ;
  }
  public String getDescription(){
    return this.description ;
  }
  public VehicleCategory getCategory(){
    return this.category ;
  }

  // Methods
  public void addVariant(VehicleVariant variant){
    this.variants.add(variant) ;
  }

  public void removeVariant(String variantId){
    VehicleVariant variant = this.variants.stream().filter(v -> v.getVariantId().equals(variantId)).findFirst().orElse(null);
    if(variant != null){
      this.variants.remove(variant) ;
    }
  }

  public Optional<VehicleVariant> findVariant(String variantId){
    return this.variants.stream().filter(variant -> variant.getVariantId().equals(variantId)).findFirst() ;
  }

  public List<VehicleVariant> getVariants(){ 
    return variants ;
  }
  
}
