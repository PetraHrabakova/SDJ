package Exercise3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteToBinary
{
  public static void main(String[] args)
  {
    // Random Object
    Random rand = new Random();

    // Scanner object
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of integers that the program should save in a binary file: ");
    int amount = sc.nextInt();

    try {
      // Create new binary file
      FileOutputStream fileOut = new FileOutputStream(("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise3\\" + "filename.bin"));

      // Create write object for binary files
      ObjectOutputStream write = new ObjectOutputStream(fileOut);

      for(int i = 1; i < amount; i++) {
        int randomNumber = rand.nextInt(100);
        write.writeInt(randomNumber);
      }
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
