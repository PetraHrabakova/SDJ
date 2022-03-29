package Exercise2;

public class FullDegreeStudent extends Student
{
  private String course;

  public FullDegreeStudent(String name, String address, int studentNo, String course) {
    super(name, address, studentNo);
    this.course = course;
  }

  public String getCourse()
  {
    return course;
  }

  public void setCourse(String course)
  {
    this.course = course;
  }

  public String toString() {
    return super.toString() +
        "\nCourse: " + course;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof FullDegreeStudent)) {
      return false;
    }
    FullDegreeStudent other = (FullDegreeStudent) obj;
    return super.equals(other) && course.equals(other.course);
  }
}
