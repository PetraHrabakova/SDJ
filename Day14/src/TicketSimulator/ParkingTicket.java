package TicketSimulator;

public class ParkingTicket
{
  double fine;
  PoliceOfficer officer;
  ParkingMeter meter;
  ParkedCar car;

  public ParkingTicket(double fine) {
    this.fine = fine;
    officer = new PoliceOfficer(officer.getName(), officer.getBadge());
    meter = new ParkingMeter(meter.getMinutesPurchased());
    car = new ParkedCar(car.getMake(), car.getModel(), car.getColor(), car.getLicenseNumber(), car.getMinutesParked());
  }

  public void setFine(double fine)
  {
    this.fine = fine;
  }

  public double getFine()
  {
    return fine;
  }

  public double calculateFine() {
    int a = meter.getMinutesPurchased();
    int b = car.getMinutesParked();
    int hour = 60;
    if (officer.hasExpired()) {
      return 0.0;
    }
    else {
      if ((b - a) <= hour) {
        return 25.00;
      }
      else {
        int c = (b / hour) - 1 + 1;
        // Gotta substract 1 hour because the
        // first hour is for 25, but the number is an integer
        // so for example 3.5 will become 3 but we want
        // the fine to be for 4 hours, so we need to add 1
        // = we add nothing but just wanted to drop a lil explantion
        return 25.00 + c*10;
      }
    }
  }

  public String ticketIssuer() {
    return officer.getBadge() + officer.getName();
  }
}
