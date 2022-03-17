public class GradeListDemo
{
  public static void main(String[] args)
  {
    GradeList list = new GradeList(10);

    list.setGrade(-3, 0);
    list.setGrade(7, 1);
    System.out.println(list.getAverage());
    System.out.println(list.getNumberOfGrades());

  }
}
