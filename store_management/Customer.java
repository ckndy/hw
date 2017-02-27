package com.codeclan.example.shop;
import java.util.*;


public class Customer {

  private String name;
  private HashMap<Payable, double> paymentOptions;
  
  public Customer(String name) {
    this.name = name;
    this.paymentOptions = new HashMap<Payable, Double>();

  }

  public String getName() {
    return this.name;
  }

  public HashMap<Payable, Double> getPaymentOptions() {
    return this.paymentOptions;
  }

  public void setPaymentOptions(Payable paymentMethod, double cardFunds){
   Double availableFunds = new Double(cardFunds);
   paymentOptions.put(paymentMethod, availableFunds);
 }
