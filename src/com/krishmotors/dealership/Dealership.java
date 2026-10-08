package com.krishmotors.dealership;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.krishmotors.customer.Address;
import com.krishmotors.inventory.Inventory;

public class Dealership {
  private String dealershipId;
  private String name;
  private Address address;
  private Inventory inventory;
  private List<Salesperson> salespersons;
  
  // Constructor
	public Dealership(String dealershipId, String name, Address address) {
		if(dealershipId == null || dealershipId.isBlank()){
      throw new IllegalArgumentException("Dealership Id cannot be null");
    }
		if(name == null || name.isBlank()){
      throw new IllegalArgumentException("Name cannot be null");
    }
		if(address == null){
      throw new IllegalArgumentException("Address cannot be null");
    }
    this.dealershipId = dealershipId;
		this.name = name;
		this.address = address;
		this.inventory = new Inventory();
    salespersons = new ArrayList<>();
  }

  // Getters
	public String getDealershipId() {
		return dealershipId;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public List<Salesperson> getSalespersons() {
		return salespersons;
	}

  // Methods
  public void addSalesperson(Salesperson salesperson){
    if(salesperson == null){
      throw new IllegalArgumentException("Salesperson cannot be null");
    }
    salespersons.add(salesperson);
  }

  public void removeSalesperson(String employeeId){
    Salesperson salesperson = salespersons.stream().filter(s -> s.getEmployeeId().equals(employeeId)).findFirst().orElse(null);
    if(salesperson != null){
      salespersons.remove(salesperson);
    }
  }
  
  public Optional<Salesperson> findSalesperson(String employeeId){
    return salespersons.stream().filter(s -> s.getEmployeeId().equals(employeeId)).findFirst();
  }

}
