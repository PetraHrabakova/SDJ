package Exercise4;

import Exercise5.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentWriteToBinary
{
  public static void main(String[] args)
  {
    try
    {
      // Create new binary file
      FileOutputStream fileOut = new FileOutputStream(("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise4\\filename.bin"));

      // Create write object for binary files
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      write.writeObject(new Student("Petra", "Hrabakova", "Czechia"));
      write.writeObject(new Student("Veronica", "Tverdohleb", "Moldova"));
      write.writeObject(new Student("Cedric", "Vermeersch", "Belgium"));

      write.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e) {
      System.out.println("IO Error writing to file");
      System.exit(1);
    }
    System.out.println("Done writing");
  }
}



