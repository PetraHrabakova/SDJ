package Exercise2;

import java.util.ArrayList;

public class Student extends Person
{
  private int studentNo;
  private ArrayList<String> grades;

  public Student(String name, String address, int studentNo) {
    super(name, address);
    this.studentNo = studentNo;
    grades = new ArrayList<>();
  }

  public int getStudentNo()
  {
    return studentNo;
  }

  public void setStudentNo(int studentNo)
  {
    this.studentNo = studentNo;
  }

  public void addGrade(String grade) {
    grades.add(grade);
  }

  public String getGrade(int index) {
    return grades.get(index);
  }

  public String[] getAllGrades() {
    String[] gradesArray = new String[grades.size()];
    return grades.toArray(gradesArray);
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < grades.size(); i++)  {
      str += grades.get(i) + ", ";
    }
    return super.toString() +
        "\nStudent number: " + studentNo + "\n" +
        "Grades: " + str;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Student)) {
      return false;
    }
    Student other = (Student) obj;
    return super.equals(other) && grades.equals(other.grades) &&
        studentNo == other.studentNo;
  }
}
