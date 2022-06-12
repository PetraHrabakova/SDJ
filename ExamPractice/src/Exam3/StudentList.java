package Exam3;

import java.util.ArrayList;

public class StudentList
{
  private int size;
  private ArrayList<Student> list;

  public StudentList() {
    size = 0;
    list = new ArrayList<Student>(size);
  }

  public void addStudent(Student student) {
    list.add(student);
  }

  public Student getStudent(int index) {
    return list.get(index);
  }

  public void removeStudent(Student student) {
    list.remove(student);
  }

  public int getNumberOfStudents() {
    return list.size();
  }

  public int getNumberOfStudentsByEducation(Education education) {
    int numberOfStudents = 0;
    for (Student student: list) {
      if (student.getEducation().equals(education)) {
        numberOfStudents += 1;
      }
    }
    return numberOfStudents;
  }

  public int getNumberOfHighSchoolStudents() {
    int numberOfStudents = 0;
    for (Student student: list) {
      if (student.getEducation().equals("High school")) {
        numberOfStudents += 1;
      }
    }
    return numberOfStudents;
  }

  private void doubleTheListCapacity() {
    int capacity = list.size();
    this.size = capacity * 2;
  }
}
