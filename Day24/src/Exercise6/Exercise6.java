package Exercise6;

import Exercise5.Student;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner read = null;
    PrintWriter write = null;

    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Petra", "Hrabakova", "Czechia"));
    list.add(new Student("Veronica", "Tverdohleb", "Moldova"));
    list.add(new Student("John", "Doe", "USA"));


    try
    {
      // Create new html file
      FileInputStream fileIn = new FileInputStream("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise6\\template.html");
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    ArrayList<String> htmlFile = new ArrayList<>();
    while (read.hasNextLine()) {
      String line = read.nextLine();
      if (line.contains("$title")) {
        htmlFile.add(line.replace("$title", "Student List"));
      }
      else if (line.contains("$header")) {
        htmlFile.add(line.replace("$header", "This is a student list example"));
      }
      else if (line.contains("$paragraph1")) {
        htmlFile.add(line.replace("$paragraph1", "See students below"));
      }
      else if (line.contains("$tableHeader1")) {
        htmlFile.add(line.replace("$tableHeader1", "Name"));
      }
      else if (line.contains("$tableHeader2")) {
        htmlFile.add(line.replace("$tableHeader2", "Country"));
      }
      else if (line.contains("$tableData1") && line.contains("$tableData2")) {
        for (int i = 0; i < list.size(); i++) {
          String newLine = line.replace("$tableData1", (((list.get(i)).getFirstName()) + " " + (list.get(i)).getLastName()));
          newLine = newLine.replace("$tableData2", (list.get(i)).getCountry() + "</tr><tr>");
          htmlFile.add(newLine);
        }
      }

      else {
        htmlFile.add(line);
      }
    }
    read.close();

    try
    {
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Petra\\SDJ\\Day24\\src\\Exercise6\\index.html");
      write = new PrintWriter(fileOut);

      for (int i = 0; i < htmlFile.size(); i++) {
        write.print(htmlFile.get(i));
      }
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    System.out.println("Done writing to file");
    write.close();

  }
}
