package com.krishmotors.payment;

import java.time.LocalDateTime;

public class Payment {
  private String paymentId;
  private double amount;
  private PaymentMethod method;
  private PaymentStatus status;
  private LocalDateTime paymentDate;

  // Constructor
  public Payment(String paymentId, double amount, PaymentMethod method) {
    if(paymentId == null || paymentId.isBlank()){
      throw new IllegalArgumentException("Payment ID cannot be null");
    }
    if(amount <= 0){
      throw new IllegalArgumentException("Amount should be greater than zero");
    }
    if(method == null){
      throw new IllegalArgumentException("Payment Method cannot be null");
    }
    
    this.paymentId = paymentId;
    this.amount = amount;
    this.method = method;
    this.status = PaymentStatus.PENDING;
    paymentDate = LocalDateTime.now();
  }
  
  // Getters
  public String getPaymentId() {
    return paymentId;
  }
  public double getAmount() {
    return amount;
  }
  public PaymentMethod getMethod() {
    return method;
  }
  public PaymentStatus getStatus() {
    return status;
  }
  public LocalDateTime getPaymentDate() {
    return paymentDate;
  }

  // Methods
  public void markCompleted(){
    if(status != PaymentStatus.PENDING){
      throw new IllegalStateException("Only a pending payment can be completed");
    }
    else status = PaymentStatus.COMPLETED;
  }
  public void markFailed(){
    if(status != PaymentStatus.PENDING){
      throw new IllegalStateException("Only a pending payment can be failed");
    }
    else status = PaymentStatus.FAILED;
  }
  public void markRefunded(){
    if(status != PaymentStatus.COMPLETED){
      throw new IllegalStateException("Only a completed payment can be refunded");
    }
    else status = PaymentStatus.REFUNDED;
  }
}
