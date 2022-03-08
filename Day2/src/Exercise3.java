import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double tax = 0.25;

    System.out.println("Enter the price of your products.");
    System.out.println("Product 1: ");
    double price1 = sc.nextDouble();
    System.out.println("Product 2: ");
    double price2 = sc.nextDouble();
    System.out.println("Product 3: ");
    double price3 = sc.nextDouble();


    double tax_x = (price1 * 0.25);
    double tax_y = (price2 * 0.25);
    double tax_z = (price3 * 0.25);

    System.out.println("Price of product 1 including tax is: " + (price1 + tax_x));
    System.out.println("Price of product 2 including tax is: " + (price2 + tax_y));
    System.out.println("Price of product 3 including tax is: " + (price3 + tax_z));
  }
}
