public class Garage
{
  Car position1;
  Car position2;

  public Garage() {
    position1 = null;
    position2 = null;
  }

  public boolean isParkingAreaTaken(int position) {
    if (position == 1 && position1 != null) {
      return true;
    }
    else if (position == 2 && position2 != null) {
      return true;
    }
    else
      return false;
  }

  public void park(Car car, int position) {
    if (!isParkingAreaTaken(1) && position == 1) {
      position1 = car;
    }
    else if (!isParkingAreaTaken(2) && position == 2) {
      position2 = car;
    }
  }

  public void leaveGarage(int position) {
    if (isParkingAreaTaken(1)) {
      position1 = null;
    }
    else if(isParkingAreaTaken(2)) {
      position2 = null;
    }
  }

  public String toString() {
    if (isParkingAreaTaken(1) && isParkingAreaTaken(2)) {
      return "Both spaces are taken.";
    }
    else if (isParkingAreaTaken(1) && !isParkingAreaTaken(2)) {
      return "Position 1 is taken and position 2 is free.";
    }
    else if (!isParkingAreaTaken(1) && isParkingAreaTaken(2)) {
      return "Position 1 is free and position 2 is taken.";
    }
    else
      return "Both positions are free.";
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Garage)) {
      return false;
    }
    Garage other = (Garage)obj;
    return other.position1 == position1 && other.position2 == position2;
  }







}
