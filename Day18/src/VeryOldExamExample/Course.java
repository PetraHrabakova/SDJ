package VeryOldExamExample;

import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor primaryInstructor;
  private Instructor secondaryInstructor;
  private ArrayList<Student> students;

  public Course(String title, Instructor primaryInstructor) {
    this.title = title;
    this.primaryInstructor = primaryInstructor;
    secondaryInstructor = null;
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    return primaryInstructor;
  }

  public Instructor getSecondaryInstructor()
  {
    return secondaryInstructor;
  }

  public void setSecondaryInstructor(Instructor secondaryInstructor)
  {
    this.secondaryInstructor = secondaryInstructor;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public int getNumberOfInstructors() {
    if (secondaryInstructor == null) {
      return 1;
    }

    else
      return 2;
  }

  public int NumberOfStudents() {
    return students.size();
  }

  public int getStudentsBySemester(int semester) {
    int count = 0;
    for(int i = 0; i < students.size(); i++) {
      if ((students.get(i).getSemester()) == semester) {
          count += 1;
      }
    }
    return count;
  }

  public boolean hasStudent(String name) {
    for (int i = 0; i < students.size(); i++) {
      if(students.get(i).getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < students.size(); i++) {
      str += students.get(i) + "\n";
    }
    return str;
  }

}
