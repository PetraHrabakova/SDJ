import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;


  public GradeList() {
     grades = new ArrayList<>();
  }

  public int getNumberOfGrades() {
    return grades.size();
  }

  public Grade[] getAllGradesAsArray() {
    Grade[] allGrades = new Grade[grades.size()];
    return grades.toArray(allGrades);
  }

  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  public double getAverage() {
    double count = 0;
    for (int i = 0; i < grades.size(); i++) {
      count += grades.get(i).getGrade();
    }
    return count / grades.size();
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < grades.size(); i++) {
      str += grades.get(i) + "\n";
    }
    return str;
  }






}
