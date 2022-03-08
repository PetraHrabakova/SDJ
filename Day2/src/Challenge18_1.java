import java.util.Scanner;

public class Challenge18_1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many shares did you buy: ");
    int shares_bought = sc.nextInt();
    System.out.println("How much did you pay per share: ");
    double price = sc.nextDouble();
    System.out.println("How many percent was the commission upon your purchase: ");
    double commission1 = sc.nextDouble();
    double commission1_calc = ((price*shares_bought)*(commission1/100));

    double total1 = (price*shares_bought) + commission1_calc;

    System.out.println("How many shares did you sell: ");
    double shares_sold = sc.nextDouble();
    System.out.println("How much did you sell your stocks for: ");
    double price_sold = sc.nextDouble();
    System.out.println("How many percent was the commission upon your purchase: ");
    double commission2 = sc.nextDouble();
    double commission2_calc = ((price_sold*shares_sold)*(commission2/100));

    double total2 = (price_sold*shares_sold) - commission2_calc;
    double total = total2 - total1;

    System.out.println("The total price he paid initially: " + total1);
    System.out.println("The commission he paid initially: " + commission1_calc);
    System.out.println("He sold the stock for: " + total2);
    System.out.println("The commission he paid when he sold: " + commission2_calc);
    System.out.println("How much did he make? " + total);
  }
}
