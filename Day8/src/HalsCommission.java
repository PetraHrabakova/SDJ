import java.util.Scanner;
import java.text.DecimalFormat;

public class HalsCommission
{
  public static void main(String[] args)
  {
    double sales;
    double advancePay;

    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    DecimalFormat percent = new DecimalFormat("#0%");

    Scanner sc = new Scanner(System.in);

    System.out.println("This program will display a pay report for a sales person");
    System.out.println("Enter the following information: ");
    System.out.println("Amount of sales: $");
    sales = sc.nextDouble();
    System.out.println("Amount og advances pay: $");
    advancePay = sc.nextDouble();

    SalesCommission payInfo = new SalesCommission(sales, advancePay);

    System.out.println("\nPay report");
    System.out.println("---------------------");
    System.out.println("Sales: $" + dollar.format(payInfo.getSales()));
    System.out.println("Commission rate: " + percent.format(payInfo.getRate()));
    System.out.println("Commission: $" + dollar.format(payInfo.getCommission()));
    System.out.println("Advanced pay: " + dollar.format(payInfo.getAdvance()));
    System.out.println("Remaining pay: " + dollar.format(payInfo.getPay()));



  }
}
