package Exercise3;

import java.io.*;
import java.util.Scanner;

public class ReadBinary
{
  public static void main(String[] args)
  {
    try {
      FileInputStream fileIn = new FileInputStream("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise3\\filename.bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while(true) {
        try {
          int x = read.readInt();
          System.out.println(x);
          }
        catch (EOFException eof) {
          System.out.println("End of the file");
          break;
          }
        }
      read.close();
      }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e) {
      System.out.println("IO Error reading file");
      System.exit(1);
    }
  }
}
