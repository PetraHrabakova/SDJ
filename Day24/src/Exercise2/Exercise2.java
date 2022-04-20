package Exercise2;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.PrintWriter;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type name of a file you want to read (with out .txt): ");
    String filename = sc.nextLine();
    Scanner read = null;

    try
    {
      FileInputStream fileIn = new FileInputStream(("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise1\\" + filename + ".txt"));
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Text in file: ");
    while (read.hasNext()) {
      System.out.println(read.nextLine());
    }
    read.close();




  }
}
