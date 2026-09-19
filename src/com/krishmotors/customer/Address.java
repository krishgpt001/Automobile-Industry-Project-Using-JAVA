package com.krishmotors.customer;

public class Address {
  private String street;
  private String city;
  private String state;
  private String postalCode;
  private String country;

  // Constructor
  public Address(String street, String city, String state, String postalCode, String country) {
    if(street == null || street.isBlank()){
      throw new IllegalArgumentException("Street cannot be blank");
    }
    if(city == null || city.isBlank()){
      throw new IllegalArgumentException("City cannot be blank");
    }
    if(state == null || state.isBlank()){
      throw new IllegalArgumentException("State cannot be blank");
    }
    if(postalCode == null || postalCode.isBlank()){
      throw new IllegalArgumentException("Postal code cannot be blank");
    }
    if(country == null || country.isBlank()){
      throw new IllegalArgumentException("Country cannot be blank");
    }

    this.street = street;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
    this.country = country;
  }

  // Getters
  public String getStreet() {
    return street;
  }
  public String getCity() {
    return city;
  }
  public String getState() {
    return state;
  }
  public String getPostalCode() {
    return postalCode;
  }
  public String getCountry() {
    return country;
  }
}
