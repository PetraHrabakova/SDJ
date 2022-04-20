package Exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.PrintWriter;

public class Exercise1
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a name of the file (with out .txt): ");
    String filename = sc.nextLine();


    try
    {
      FileOutputStream fileOut = new FileOutputStream(("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise1\\" + filename + ".txt"));
      write = new PrintWriter(fileOut);
      System.out.println("Enter a name of your friend: ");
      String name = sc.nextLine();
      write.println(name);

      do {
        System.out.println("Enter a name of your friend (type DONE to exit): ");
        name = sc.nextLine();
        if (!name.equals("DONE")) {
          write.println(name);
        }
        System.out.println("Wrote data to file");
      }
      while(!(name.equals("DONE")));

    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    System.out.println("Done writing to file");
    write.close();


  }
}
