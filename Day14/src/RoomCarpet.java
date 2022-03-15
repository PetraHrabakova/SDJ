public class RoomCarpet
{
  RoomDimension size;
  double carpetCost;

  public RoomCarpet(RoomDimension size, double carpetCost) {
    this.size = size;
    this.carpetCost = carpetCost;
  }

  public double getTotalCost() {
    return size.getArea() * carpetCost;
  }

  public String toString() {
    return "Carpet cost: " + getTotalCost() + "DKK";
  }
}
