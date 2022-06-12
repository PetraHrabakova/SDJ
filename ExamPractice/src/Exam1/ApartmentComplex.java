package Exam1;

import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Residence> residences;

  public ApartmentComplex(String address) {
    this.address = address;
    residences = new ArrayList<Residence>();
  }

  public int getNumberOfResidences() {
    return residences.size();
  }

  public void add(Residence residence) {
    residences.add(residence);
  }

  public Residence getResidence(int index) {
    return residences.get(index);
  }

  public Residence getResidenceByNumber(int number) {
    for (int i = 0; i < residences.size(); i++) {
      if (residences.get(i).getNumber() == number) {
        return residences.get(i);
      }
    }
    return null;
  }

  public Room getFirstAvailableRoom() {
    for (int i = 0; i < residences.size(); i++) {
      if (residences.get(i).getType().equals("Room") && residences.get(i).isAvailable()) {
        return new Room(residences.get(i).getNumber(), residences.get(i).getSize());
      }
    }
    return null;
  }

  public Apartment getFirstAvailableApartment(int minNoOfRooms) {
    for (int i = 0; i < residences.size(); i++) {
      if (residences.get(i).getType().equals("Apartment") && residences.get(i).isAvailable() && residences.get(i).getNumberOfRooms() >= minNoOfRooms) {
        return new Apartment(residences.get(i).getNumber(), residences.get(i).getSize(), residences.get(i).getNumberOfRooms());
      }
    }
    return null;
  }
}
