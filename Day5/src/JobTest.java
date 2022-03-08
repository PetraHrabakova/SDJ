public class JobTest
{
  public static void main(String[] args)
  {
    Person person1 = new Person("Peter", "29/06/1998");
    Person person2 = new Person("Elena", "25/11/1998");
    Job job1 = new Job("Mr", 2000, person1);
    Job job2 = new Job("Mrs", 3000, person2);

    job1.setEmployee(person1);
    System.out.println("Title: " + job1.getTitle());
    System.out.println(job1.getEmployee());
    System.out.println("Salary: " + job1.getSalary());
    System.out.println("Percentage raise: " + job1.givePercentageRaise(10.0));

    job2.setEmployee(person2);
    System.out.println("Title: " + job2.getTitle());
    System.out.println(job2.getEmployee());
    System.out.println("Salary: " + job2.getSalary());
    System.out.println("Percentage raise: " + job2.givePercentageRaise(10.0));



  }
}
