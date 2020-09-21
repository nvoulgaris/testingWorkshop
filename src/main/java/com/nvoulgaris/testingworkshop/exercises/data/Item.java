package com.nvoulgaris.testingworkshop.exercises.data;

public class Item {

  private String name;
  private int quantity;
  private int price;
  private boolean halfprice;

  public Item(String name, int quantity, int price, boolean halfprice) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.halfprice = halfprice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isHalfprice() {
    return halfprice;
  }

  public void setHalfprice(boolean halfprice) {
    this.halfprice = halfprice;
  }
}
