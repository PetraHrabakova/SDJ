package TicketSimulator;

public class PoliceOfficer
{
  String name;
  String badge;
  ParkedCar car;
  ParkingMeter meter;
  ParkingTicket ticket;

  public PoliceOfficer(String name, String badge) {
    this.name = name;
    this.badge = badge;
    meter = new ParkingMeter(meter.getMinutesPurchased());
    car = new ParkedCar(car.getMake(), car.getModel(), car.getColor(), car.getLicenseNumber(), car.getMinutesParked());
    ticket = new ParkingTicket(ticket.getFine());
  }

  public String getName()
  {
    return name;
  }

  public String getBadge()
  {
    return badge;
  }

  public boolean hasExpired() {
    return car.getMinutesParked() > meter.getMinutesPurchased();
  }

  public ParkingTicket issuesTicket() {
    ParkingTicket newTicket = new ParkingTicket(ticket.getFine());
    return newTicket;


  }


}
