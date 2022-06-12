package Exam5;

public class WeightedItem extends Item
{
  public double weight;

  public WeightedItem(String name, double price, double weight) {
    super(name, price);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof WeightedItem)) {
      return false;
    }
    WeightedItem other = (WeightedItem) obj;
    return super.equals(other) && weight == other.weight;
  }

  public String getInfo() {
    return super.toString() + " | Weight: " + weight + " kg";
  }
}
