package Exercise1;

public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner, double price) {
    this.price = price;
    this.owner = owner;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Vehicle)) {
      return false;
    }
    Vehicle other = (Vehicle) obj;
    return price == other.price && owner.equals(other.owner);
  }

  public String toString() {
    return "Owner: " + owner +
        "\nPrice: " + price;
  }
}
