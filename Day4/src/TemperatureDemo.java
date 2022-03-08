import java.util.Scanner;

public class TemperatureDemo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in Fahrenheit: ");
    double user_input = sc.nextDouble();

    Temperature temp = new Temperature(user_input);

    System.out.println(temp.getCelcius());
    System.out.println(temp.getKelvin());

  }
}
