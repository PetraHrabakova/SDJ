package TicketSimulator;

public class TicketSimulatorDemo
{
  public static void main(String[] args)
  {
    ParkedCar car = new ParkedCar("Tesla", "3", "red", "37CUDV", 564);
    ParkingMeter meter = new ParkingMeter(45);
    PoliceOfficer officer = new PoliceOfficer("Mark", "IDBVI");

    System.out.println(officer.hasExpired());
  }
}
