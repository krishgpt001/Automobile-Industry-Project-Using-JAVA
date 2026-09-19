package com.krishmotors.exception;

public class InsufficientPaymentException extends Exception{
  private double amountDue;
  private double amountPaid;

  public InsufficientPaymentException(String message,double amountDue,double amountPaid){
    super(message);
    this.amountDue = amountDue;
    this.amountPaid = amountPaid;
  }

  // Getters
  public double getAmountDue() {
    return amountDue;
  }
  public double getAmountPaid() {
    return amountPaid;
  }
}
