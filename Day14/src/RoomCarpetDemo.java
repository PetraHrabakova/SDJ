public class RoomCarpetDemo
{
  public static void main(String[] args)
  {
    RoomDimension size = new RoomDimension(20, 30);
    RoomCarpet room = new RoomCarpet(size, 20);

    room.getTotalCost();
    System.out.println(room);
  }
}
