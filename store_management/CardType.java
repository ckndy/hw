package com.codeclan.example.shop;

public enum CardType {

 VISA_CREDIT("Credit"),
 VISA_DEBIT("Debit"),

 private final String type;

 CardType(String type){
     this.type = type;
}

public String getType(){
     return this.type;
 }

}
