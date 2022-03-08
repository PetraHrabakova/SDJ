public class Student
{
  String name;
  char gender;
  int student_number;

  public Student(String name, char gender, int student_number) {
    this.name = name;
    this.gender = gender;
    this.student_number = student_number;
  }

  public Student(String name, char gender) {
    this.name = name;
    this.gender = gender;
    student_number = 0;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudentNumber(int student_number) {
    this.student_number = student_number;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  public int getStudentNumber() {
    return student_number;
  }

  public String toString() {
    return "Name: " + name + "\nGender: " + gender + "\nStudent number: " + student_number;
  }

}
