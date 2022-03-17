public class Grade
{
  String courseName;
  int grade;

  public Grade(String courseName, int grade) {
    this.courseName = courseName;
    this.grade = grade;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public String toString() {
    return "Grade: " + grade +
        "\nCourse name: " + courseName;
  }
}
