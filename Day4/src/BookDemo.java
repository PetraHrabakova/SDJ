import java.util.Scanner;

public class BookDemo
{
  public static void main(String[] args)
  {
    double discount = 0.80;
    Scanner sc = new Scanner(System.in);

    // Information about book 1
    System.out.println("Author name of book 1:");
    String author1 = sc.nextLine();

    System.out.println("Title of book 1: ");
    String title1 = sc.nextLine();

    System.out.println("Price of book 1: ");
    double price1 = sc.nextDouble();

    System.out.println("Pages of book 1: ");
    int pages1 = sc.nextInt();
    sc.nextLine();

    // Information about book 2
    System.out.println("Author name of book 2:");
    String author2 = sc.nextLine();

    System.out.println("Title of book 2: ");
    String title2 = sc.nextLine();

    System.out.println("Price of book 2: ");
    double price2 = sc.nextDouble();

    System.out.println("Pages of book 2: ");
    int pages2 = sc.nextInt();

    Book book1 = new Book(author1, title1, price1, pages1);
    Book book2 = new Book(author2, title2, price2, pages2);

    // Print stuff
    // System.out.println(book1);
    // System.out.println(book2);
    book1.setPrice(book1.getPrice()*0.8);
    System.out.println("The new book information is: " + book1);
    book2.setPrice(book1.getPrice()*0.8);
    System.out.println("The new book information is: " + book2);


  }
}
