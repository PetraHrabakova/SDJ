public class GradeListDemo
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("DMA", 12);
    Grade grade3 = new Grade("SEP", 12);
    GradeList grades = new GradeList();

    grades.addGrade(grade1);
    grades.addGrade(grade2);
    grades.addGrade(grade3);

    grades.getAllGradesAsArray();
    System.out.println(grades.getAverage());
    System.out.println(grades);
  }
}
