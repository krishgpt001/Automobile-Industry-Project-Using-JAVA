package com.krishmotors.inventory;

import com.krishmotors.exception.VehicleNotFoundException;
import com.krishmotors.exception.VehicleUnavailableException;
import com.krishmotors.vehicle.VehicleStatus;
import com.krishmotors.vehicle.VehicleCategory;
import java.util.List;

public class InventoryService {
  private Inventory inventory;

  // Constructor
  public InventoryService(Inventory inventory) {
    this.inventory = inventory;
  }

  // Methods
  public void reserveVehicle(String vin) throws VehicleNotFoundException,VehicleUnavailableException{
    InventoryItem item = inventory.findItem(vin);
    if (item.getVehicle().getStatus() == VehicleStatus.AVAILABLE) item.getVehicle().changeStatus(VehicleStatus.RESERVED);
    else throw new VehicleUnavailableException("Vehicle is currently unaivailable");
  }
  
  public void markAsSold(String vin) throws VehicleNotFoundException{
    InventoryItem item = inventory.findItem(vin);
    item.getVehicle().changeStatus(VehicleStatus.SOLD);
  }

  public List<InventoryItem> findAvailableVehicles(VehicleCategory category){
    List<InventoryItem> items = inventory.getItems().stream().filter(i -> i.getVehicle().getStatus() == VehicleStatus.AVAILABLE && i.getVehicle().getVariant().getModel().getCategory() == category).toList();
    return items;
  }
}
