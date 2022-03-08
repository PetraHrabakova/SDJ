import java.util.Scanner;

public class PayrollDemo
{
  public static void main(String[] args)
  {
    // Construct objects
    Scanner sc = new Scanner(System.in);
    Payroll payroll1 = new Payroll();

    // Get values from the user
    System.out.println("Insert your name: ");
    String name = sc.nextLine();

    System.out.println("Insert your pay rate: ");
    double payrate = sc.nextInt();

    System.out.println("Insert how many hours you worked: ");
    double hours = sc.nextInt();

    // Set values
    payroll1.setName(name);
    payroll1.setPayrate(payrate);
    payroll1.setNumberOfHours(hours);

    // Print values
    System.out.println("Your name is: " + payroll1.getName());
    System.out.println("Your gross pay is: " + payroll1.grossPay());

  }
}
