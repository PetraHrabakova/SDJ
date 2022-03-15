public class BrainDemo
{

  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(29, 6, 1998);
    Person person = new Person("Petra", birthday);

    System.out.println(person.getIQ());
    person.rememberThis("Hello");
    person.rememberThis("My name is Petra");
    person.rememberThis("I live in Aarhus");
    person.rememberThis("I study software engineering");
    // person.rememberThis("Hello");
    System.out.println(person.doYouRemember("Hello"));
    // System.out.println(person.doYouRemember("My name is Petra"));
    System.out.println(person.isBrainDamaged());
    System.out.println(person.getIQ());
    System.out.println(person);



  }



}
