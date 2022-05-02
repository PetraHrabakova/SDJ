package Main;

import Model.CarList;
import Model.CarModelManager;

public class CarSystemTest
{
  public static void main(String[] args)
  {
    CarModelManager cmm = new CarModelManager("C:\\Users\\Petra\\SDJ\\Day25\\src\\cars.bin");
    CarList list = cmm.getAllCars();
    System.out.println("All cars:\n" + list);
  }
}
