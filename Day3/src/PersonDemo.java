public class PersonDemo
{
  public static void main(String[] args)
  {
    Person person1 = new Person();
    Person person2 = new Person();

    // Create Person 1
    person1.setName("Petra");
    person1.setBirthday("29/06/1998");

    // Create Person 2
    person2.setName("Olga");
    person2.setBirthday("29/07/2000");

    // Print details of Person 1
    System.out.println("The name of Person 1: " + person1.getName());
    System.out.println("The birthday of Person 1: " + person1.getBirthday());

    // Print details of Person 2
    System.out.println("The name of Person 2: " + person2.getName());
    System.out.println("The birthday of Person 2: " + person2.getBirthday());


  }
}
