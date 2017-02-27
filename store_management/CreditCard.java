package com.codeclan.example.shop;

public class CreditCard extends Card {

  private String bank;

  public AndroidPay(String bank, CardType cardType) {
    this.bank = bank;
    this.cardType = cardType;
  }

  public String getBank() {
    return this.bank;
  }
}