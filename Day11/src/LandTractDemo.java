import java.util.Scanner;

public class LandTractDemo
{
  public static void main(String[] args)
  {
    double width;
    double length;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter dimension of field 1 as integers: ");
    System.out.println("Length: ");
    length = sc.nextInt();
    System.out.println("Width: ");
    width = sc.nextInt();

    LandTract land1 = new LandTract(length, width);

    System.out.println("Enter dimension of field 2 as integers: ");
    System.out.println("Length: ");
    length = sc.nextInt();
    System.out.println("Width: ");
    width = sc.nextInt();

    LandTract land2 = new LandTract(length, width);

    System.out.println(land1.equals(land2));
    System.out.println(land1);
    System.out.println(land2);


  }
}
