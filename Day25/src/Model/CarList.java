package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
      {
        return i;
      }
    }
    return -1;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public Car getCar(String regNumber)
  {
    if (indexOfRegNumber(regNumber) != -1)
    {
      return getCar(indexOfRegNumber(regNumber));
    }
    else
      return null;
  }

  public void addCar(Car newCar) {
    if (indexOfRegNumber(newCar.getRegNumber()) == -1) {
      cars.add(newCar);
    }
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < cars.size(); i++) {
      str += cars.get(i) + "\n";
    }
    return str;
  }

}

