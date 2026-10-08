package com.krishmotors.dealership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.krishmotors.sales.Sale;

public class Salesperson {
  private String employeeId;
  private String name;
  private String email;
  private String phone;
  private LocalDate hireDate;
  private List<Sale> salesMade;

  // Constructor
  public Salesperson(String employeeId, String name, String email, String phone) {
    if(employeeId == null || employeeId.isBlank()){
      throw new IllegalArgumentException("EmployeeId cannot be null");
    }
    if(name == null || name.isBlank()){
      throw new IllegalArgumentException("Name cannot be null");
    }
    if(email == null || email.isBlank()){
      throw new IllegalArgumentException("Email cannot be null");
    }
    if(phone == null || phone.isBlank()){
      throw new IllegalArgumentException("Phone cannot be null");
    }
    this.employeeId = employeeId;
    this.name = name;
    this.email = email;
    this.phone = phone;
    hireDate = LocalDate.now();
    salesMade = new ArrayList<>();
  }

  // Getters
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public List<Sale> getSalesMade() {
		return salesMade;
	}

  // Methods
  public void recordSale(Sale sale){
    if(sale == null){
      throw new IllegalArgumentException("Sale cannot be null");
    }
    salesMade.add(sale);
  }

  public int getTotalSalesCount(){
    return salesMade.size();
  }

  public double getTotalRevenue(){
    return salesMade.stream().mapToDouble(s -> s.getPriceBreakdown().getTotalPrice()).sum();
  }

}
