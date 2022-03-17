public class GradeListDemo
{
  public static void main(String[] args)
  {
    GradeList list = new GradeList(3);
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("SDJ", 12);
    Grade grade3 = new Grade("SDJ", 12);

    list.setGrade(grade1, 0);
    list.setGrade(grade2, 1);
    list.setGrade(grade3, 2);
    System.out.println(list);


  }
}
