public class StudentDemo
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Peter", 'M', 34);
    Student student2 = new Student("Tobias", 'M', 21);
    Student student3 = new Student("Maria", 'F', 13);

    student1.setName("Leo");
    student1.setStudentNumber(20);

    // Student 1
    System.out.println("Student 1");
    System.out.println(student1);

    // Student 2
    System.out.println("Student 2");
    System.out.println(student2);

    // Student 3
    System.out.println("Student 3");
    System.out.println(student3);

  }
}
