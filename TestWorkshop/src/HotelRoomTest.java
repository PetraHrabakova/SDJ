import java.sql.SQLOutput;

public class HotelRoomTest
{
  public static void main(String[] args)
  {
    // Create three HotelRoom objects
    HotelRoom room1 = new HotelRoom(1, 1000.00);
    HotelRoom room2 = new HotelRoom(2, 2000.00);
    HotelRoom room3 = new HotelRoom(3, 3000.00);

    // Change rent of the first room
    room1.setRent(4000.00);

    // Create two Guest objects and check each of them into a room
    Guest guest1 = new Guest("Alan");
    Guest guest2 = new Guest("Petra");
    room1.checkIn(guest1);
    room2.checkIn(guest2);

    // Print out all information of the three HotelRoom objects using toString() method
    System.out.println(room1);
    System.out.println(room2);
    System.out.println(room3);

  }
}
