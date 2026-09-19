package com.krishmotors.inventory;

import com.krishmotors.exception.VehicleNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
  private List<InventoryItem> items;

  // Constructor
  public Inventory(){
    items = new ArrayList<>();
  }

  // Methods
  public void addItem(InventoryItem item){
    this.items.add(item);
  }

  public void removeItem(String vin) throws VehicleNotFoundException {
    InventoryItem item = this.items.stream().filter(i -> i.getVehicle().getVin().equals(vin)).findFirst().orElse(null);
    if(item != null) this.items.remove(item);
    else throw new VehicleNotFoundException("Vehicle having vin "+vin+" not found");
  }
  
  public InventoryItem findItem(String vin) throws VehicleNotFoundException{
    InventoryItem item = this.items.stream().filter(i -> i.getVehicle().getVin().equals(vin)).findFirst().orElse(null);
    if(item != null) return item;
    else throw new VehicleNotFoundException("Vehicle having vin "+vin+" not found");
  }

  public List<InventoryItem> getItems(){
    return this.items;
  }

}
