package Model;

import Model.CarList;
import Model.Car;
import Model.Owner;
import Utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName) {
    this.fileName = fileName;
  }

  public CarList getAllCars() {
    CarList cars = new CarList();

    try
    {
      cars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
    catch (IOException e) {
      System.out.println("IO Error reading file");
    }

    catch (ClassNotFoundException e) {
      System.out.println("Class not found");
    }
    return cars;
  }

  public void addCar(Car car) {
    CarList allCars = getAllCars();
    allCars.addCar(car);

    try
    {
      MyFileHandler.writeToBinaryFile(fileName, allCars);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  public void addCars(CarList list) {
    CarList allCars = getAllCars();

    // Add all cars from the new CarFile to the old one
    for (int i = 0; i < list.size(); i++) {
      allCars.addCar(list.getCar(i));
    }

    try
    {
      MyFileHandler.writeToBinaryFile(fileName, allCars);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void deleteCar(Car car) {
    CarList allCars = getAllCars();
    CarList newCarList = new CarList();

    // If the car we want to delete is not equals to car(i)
    // Put it in the new list
    for (int i = 0; i < allCars.size(); i++) {
      if (!(allCars.getCar(i).equals(car))) {
        newCarList.addCar(allCars.getCar(i));
      }
    }

    try
    {
      MyFileHandler.writeToBinaryFile(fileName, newCarList);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void deleteCars(Car car) {
    CarList allCars = getAllCars();
    CarList newCarList = new CarList();

    // If the car we want to delete is not equals to car(i)
    // Put it in the new list
    for (int i = 0; i < allCars.size(); i++) {
      if (!(allCars.getCar(i).equals(car))) {
        newCarList.addCar(allCars.getCar(i));
      }
    }

    try
    {
      MyFileHandler.writeToBinaryFile(fileName, newCarList);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  public void deleteCarByRegNumber(String regNumber) {
    CarList allCars = getAllCars();
    CarList newCarList = new CarList();

    // If the registration number is not equal to
    // the car's registration number of the index "i"
    // Put it in the new list
    for (int i = 0; i < allCars.size(); i++) {
      if (!((allCars.getCar(i)).getRegNumber()).equals(regNumber)) {
        newCarList.addCar(allCars.getCar(i));
      }
    }

    try
    {
      MyFileHandler.writeToBinaryFile(fileName, newCarList);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

}
