import java.util.Scanner;

public class StringCompareTo
{
  public static void main(String[] args)
  {
    String name1, name2;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name 1: ");
    name1 = sc.nextLine();

    System.out.println("Enter name 2: ");
    name2 = sc.nextLine();

    // Compare names
    if(name2.compareTo(name2) < 0)
    {
      System.out.println(name1 + " is less than " + name2);
    }
    else if (name1.compareTo(name2) == 0)
    {
      System.out.println(name1 + " is equal to " + name2);
    }
    else if (name1.compareTo(name2) > 0)
    {
      System.out.println(name1 + " is greater than " + name2);
    }

  }
}
