public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades) {
    grades = new int[numberOfGrades];
    for(int i = 0; i < numberOfGrades; i++) {
      grades[i] = -1;
    }
  }

  public int getNumberOfGrades() {
    int sum = 0;
    for (int i = 0; i < grades.length; i++) {
      if (grades[i] != -1) {
        sum += 1;
      }
    }
    return sum;
  }

  public int getGrade(int index) {
    return grades[index];
  }

  public void setGrade(int grade, int index) {
    grades[index] = grade;
  }

  public double getAverage() {
    double average = 0;
    double sum = 0;
    for (int i = 0; i < grades.length; i++) {
      if(grades[i] != -1) {
        sum += grades[i];
      }
    }
    return average = sum/getNumberOfGrades();
  }

  public String toString() {
    return "Number of grades: " + getNumberOfGrades() +
        "Average of grades: " + getAverage();
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof GradeList)) {
      return false;
    }
    GradeList other = (GradeList) obj;
    if (grades.length != other.grades.length) {
      return false;
    }
    else {
      for (int i = 0; i < grades.length; i++) {
        if (grades[i] != other.grades[i]) {
          return false;
        }
      }
      return true;
    }
  }
}
