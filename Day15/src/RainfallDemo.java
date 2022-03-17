import java.util.jar.JarOutputStream;

public class RainfallDemo
{
  public static void main(String[] args)
  {
    double[] rainfall = {3, 4, 3, 2, 10, 3, 2, 6, 4, 9, 3, 12};
    Rainfall rainfalls = new Rainfall(rainfall);

    System.out.println(rainfalls.averageRainfalls());
    System.out.println(rainfalls.totalRainfalls());
    System.out.println(rainfalls.leastRain());
    System.out.println(rainfalls.mostRain());

  }
}
