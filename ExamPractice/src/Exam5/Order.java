package Exam5;

import java.util.ArrayList;

public class Order
{
  public int numberOfOrderLines;
  public ArrayList<OrderLine> lines;

  public Order(int maxNumberOfOrderLines) {
    lines = new ArrayList<>(maxNumberOfOrderLines);
    numberOfOrderLines = 0;
  }

  public void addOrderLine(Item item, int amount) {
    OrderLine newLine = new OrderLine(item, amount);
    lines.add(newLine);
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (OrderLine line: lines) {
      totalPrice += line.getItem().getPrice();
    }
    return totalPrice;
  }

  public Item getOrderItem(int orderLineIndex) {
    return lines.get(orderLineIndex).getItem();
  }

  public int getAmountOfOrderItem(int orderLineIndex) {
    return lines.get(orderLineIndex).getAmount();
  }

  public double getTotalWeightForWeightedItems() {
    double totalWeight = 0;
    for (OrderLine line: lines) {
      if (line.getItem() instanceof WeightedItem) {
        totalWeight += ((WeightedItem) line.getItem()).getWeight();
      }
    }
    return totalWeight;
  }

  public String toString() {
    String str = "";
    for (OrderLine line: lines) {
      str += line;
    }
    return str;
  }
}
