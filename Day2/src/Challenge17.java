import java.util.Scanner;

public class Challenge17
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert your name: ");
    String name = sc.nextLine();                    // Input name
    System.out.println("Insert your age: ");
    int age = sc.nextInt();                         // Input age
    sc.nextLine();                                  // Insert next line after integer to get String
    System.out.println("Insert your city: ");
    String city = sc.nextLine();                    // Input city
    System.out.println("Insert your college: ");
    String college = sc.nextLine();                 // Input college
    System.out.println("Insert you profession: ");
    String profession = sc.nextLine();              // Input profession
    System.out.println("Insert what kind of pet you have: ");
    String pet = sc.nextLine();                     // Input pet
    System.out.println("Insert your pet's name: ");
    String pet_name = sc.nextLine();                // Input pet's name


    System.out.println("There once a person named " + name +
        " who lived in " + city + ".\nAt the age of " + age + ", "
    + name + " went to college at " + college + ".\n" + name +
        " graduated and went to work as a " + profession +
        ".\nThen, " + name + " adopted a(n) " + pet + " named "
    + pet_name + ".\nThey both lived happily ever after!");

  }
}
