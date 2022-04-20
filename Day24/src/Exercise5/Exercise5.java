package Exercise5;

import java.io.*;
import java.util.ArrayList;

public class Exercise5
{
  public static void main(String[] args)
  {
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Petra", "Hrabakova", "Czechia"));
    list.add(new Student("Veronica", "Tverdohleb", "Moldova"));

    try {
      // Create new binary file
      FileOutputStream fileOut = new FileOutputStream(("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise5\\" + "filename.xml"));
      PrintWriter write = new PrintWriter(fileOut);

      write.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      write.println("<students>");
      for (int i = 0; i < list.size(); i++) {
        write.println("\t<student>");
        write.print("\t\t<firstname>");
        write.print(list.get(i).getFirstName());
        write.println("</firstname>");
        write.print("\t\t<lastname>");
        write.print(list.get(i).getLastName());
        write.println("</lastname>");
        write.print("\t\t<country>");
        write.print(list.get(i).getCountry());
        write.println("</country>");
        write.println("\t</student>");
      }
      write.println("</students>");
      write.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Done writing");

  }
}

