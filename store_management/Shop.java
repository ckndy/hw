package example.codeclan.com.shop;

import java.util.*;

public class Shop {

  private String name;
  private Double sales;
  private Double refunds;

  public Shop(String name) {
    this.name = name;
    this.sales = new Double; 
    this.refunds = new Double;
  }

  public String getName() {
    return this.name;
  }

  public Double getSales() {
    return this.sales;
  }

  public double getRefunds() {
    return this.refunds;
  }

  public Double updateSales(double update) {
    Double newSales = new Double(update);
    Double currentSales = getSales();
    this.sales = currentSales + newSales;
    return this.sales;
  }

  public Double updateRefunds(double update) {
    Double newRefunds = new Double(update);
    Double currentRefunds = getRefunds();
    this.refunds = currentRefunds + newRefunds;
    return this.refunds;
  }

  public Double getIncomeReport() {
    Double currentSales = getSales();
    Double currentRefunds = getRefunds();
    Double totalIncome = currentSales - currentRefunds;
    return totalIncome;
  }
}