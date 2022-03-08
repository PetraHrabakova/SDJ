import java.util.Scanner;

public class Challenge18
{
  public static void main(String[] args)
  {
      int shares_bought = 1000;
      double price = 32.87;
      double commission1 = 2;
      double commission1_calc = ((price*shares_bought)*(commission1/100));

      double total1 = (price*shares_bought) + commission1_calc;

      double shares_sold = 1000;
      double price_sold = 33.92;
      double commission2 = 2;
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
