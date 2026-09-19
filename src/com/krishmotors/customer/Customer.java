package com.krishmotors.customer;

import java.time.LocalDate;

public class Customer {
  private String id;
  private String name;
  private String phone;
  private String email;
  private Address address;
  private CustomerType customerType;
  private LocalDate registeredOn;
  // Constructor
  public Customer(String id, String name, String phone, String email, Address address, CustomerType customerType) {
    if(id == null || id.isBlank()){
      throw new IllegalArgumentException("Id cannot be blank");
    }
    if(name == null || name.isBlank()){
      throw new IllegalArgumentException("Name cannot be Blank");
    }
    if(phone == null || phone.isBlank()){
      throw new IllegalArgumentException("Phone number cannot be empty");
    }
    if(email == null || email.isBlank()){
      throw new IllegalArgumentException("Email Id cannot be blank");
    }
    if(address == null){
      throw new IllegalArgumentException("Address cannot be null");
    }
    if(customerType == null){
      throw new IllegalArgumentException("Customer Type cannot be null");
    }
    
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.address = address;
    this.customerType = customerType;
    this.registeredOn = LocalDate.now();
  }
  
  // Getters
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getPhone() {
    return phone;
  }
  public String getEmail() {
    return email;
  }
  public Address getAddress() {
    return address;
  }
  public CustomerType getCustomerType() {
    return customerType;
  }
  public LocalDate getRegisteredOn() {
    return registeredOn;
  }
  
  // Methods
  public void updateContactInfo(String phone , String email){
    if(phone == null || phone.isBlank()){
      throw new IllegalArgumentException("Phone number cannot be blank");
    }
    if(email == null || email.isBlank()){
      throw new IllegalArgumentException("Email Id cannot be blank");
    }
    this.phone = phone;
    this.email = email;
  }

  public void updateAddress(Address newAddress){
    if(newAddress == null){
      throw new IllegalArgumentException("Address cannot be null");
    }
    this.address = newAddress;
  }
}
