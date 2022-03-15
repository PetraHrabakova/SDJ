package TicketSimulator;

public class ParkingMeter
{
  int minutesPurchased;

  public ParkingMeter(int minutesPurchased) {
    this.minutesPurchased = minutesPurchased;
  }

  public void setMinutesPurchased(int minutesPurchased)
  {
    this.minutesPurchased = minutesPurchased;
  }

  public int getMinutesPurchased()
  {
    return minutesPurchased;
  }
}
