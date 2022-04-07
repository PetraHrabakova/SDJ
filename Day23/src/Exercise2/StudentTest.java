package Exercise2;

public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Petra", 11);

    try
    {
      student1.getGrade();
      System.out.println(student1);
    }
    catch (IllegalGradeException e) {
      System.out.println(e.getMessage());
    }


  }
}
