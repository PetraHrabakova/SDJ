import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your name: ");
    String name = sc.nextLine();
    System.out.println("Please enter your age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Please enter your address: ");
    String address = sc.nextLine();


    System.out.println("Your name: " + name);
    System.out.println("Your age: " + age);
    System.out.println("Your address: " + address);

  }
}
