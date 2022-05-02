package OldExam1;

import java.util.ArrayList;

public class FerrySchedule
{
  private ArrayList<Departure> departures;

  public FerrySchedule() {
    departures = new ArrayList<>();
  }

  public void addDeparture(String dayAndTime, Trip trip) {
    Departure newDeparture = new Departure(dayAndTime, trip);
    departures.add(newDeparture);
  }

  public int getDepartureCount() {
    return departures.size();
  }

  public Departure getDeparture(int index) {
    return departures.get(index);
  }

  public ArrayList<Departure> getDeparturesFrom(Harbor harbor) {
    ArrayList<Departure> departuresFrom = new ArrayList<>();
    for (int i = 0; i < departures.size(); i++) {
      if ((departures.get(i)).getFrom().equals(harbor.getTown())) {
        departuresFrom.add(departures.get(i));
      }
    }
    return departuresFrom;
  }
}
