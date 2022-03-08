import java.sql.SQLOutput;
import java.util.Scanner;

public class GoodStringCompare
{
  public static void main(String[] args)
  {
    String name1, name2, name3;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name 1: ");
    name1 = sc.nextLine();

    System.out.println("Enter name 2: ");
    name2 = sc.nextLine();

    System.out.println("Enter name 3: ");
    name3 = sc.nextLine();

    // Compare name1 and name2

    if (name1.equals(name2))
    {
      System.out.println(name1 + " and " + name2 + " are the same.");
    }
    else
    {
      System.out.println(name1 + " and " + name2 + " are NOT the same.");
    }

    // Compare name1 and name3
    if (name1.equals(name3))
    {
      System.out.println(name1 + " and " + name3 + " are the same.");
    }
    else
    {
      System.out.println(name1 + " and " + name3 + " are NOT the same.");
    }
  }

}
