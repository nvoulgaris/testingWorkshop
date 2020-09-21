package com.nvoulgaris.testingworkshop.exercises.data;

import java.util.List;

public class Cart {

  public int calculateTotal(List<Item> items) {
    int total = 0;

    for (Item item : items) {
      int itemPrice = item.getPrice();

      if (item.isHalfprice()) {
        itemPrice /= 2;
      }

      total += itemPrice * item.getQuantity();
    }

    return total;
  }
}
