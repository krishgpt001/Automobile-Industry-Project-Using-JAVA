package com.krishmotors.dealership;

import com.krishmotors.inventory.InventoryService;
import com.krishmotors.sales.SalesManager;
import com.krishmotors.sales.Sale;

public class DealershipService {
  private Dealership dealership;
  private InventoryService inventoryService;
  private SalesManager salesManager;
  
  // Constructor
  public DealershipService(Dealership dealership,SalesManager salesManager) {
    if(dealership == null){
      throw new IllegalArgumentException("Dealership cannot be null");
    }
    if(salesManager == null){
      throw new IllegalArgumentException("Sales Manager cannot be null");
    }
    this.dealership = dealership;
    this.inventoryService = new InventoryService(dealership.getInventory());
    this.salesManager = salesManager;
  }

  // Getters
  public Dealership getDealership() {
    return dealership;
  }
  public InventoryService getInventoryService() {
    return inventoryService;
  }
  public SalesManager getSalesManager() {
    return salesManager;
  }

  // Methods
  public void assignSalespersonToSale(String employeeId,Sale sale){
    if(employeeId == null || employeeId.isBlank()){
      throw new IllegalArgumentException("Employee Id cannot be null");
    }
    Salesperson salesperson = dealership.findSalesperson(employeeId).orElseThrow(() -> new IllegalArgumentException("No salesperson found with this ID "+employeeId));
    salesperson.recordSale(sale);
  }
  
}
