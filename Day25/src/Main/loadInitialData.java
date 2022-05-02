package Main;

import Model.CarList;
import Model.Owner;
import Model.Car;
import Utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class loadInitialData
{
  public static void main(String[] args)
  {
    CarList cars = new CarList();
    String[] carArray = null;

    try {
      carArray = MyFileHandler.readArrayFromTextFile("C:\\Users\\Petra\\SDJ\\Day25\\src\\data.txt");
      for(int i = 0; i < carArray.length; i++) {
        String temp = carArray[i];
        String[] tempArr = temp.split(",");
        String regNumber = tempArr[0];
        String make = tempArr[1];
        String model = tempArr[2];
        String year = tempArr[3];
        String firstName = tempArr[4];
        String lastName = tempArr[5];

        Owner owner = new Owner(firstName, lastName);
        cars.addCar(new Car(owner, regNumber, make, model, Integer.parseInt(year)));
      }
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
    }

    try {
      MyFileHandler.writeToBinaryFile("Day25/src/cars.bin", cars);
    }
    catch (FileNotFoundException e) {
      System.out.println("Error opening file");
    }
    catch (IOException e) {
      System.out.println("IO Error writing to file");
    }
    System.out.println("Done");
  }
}
