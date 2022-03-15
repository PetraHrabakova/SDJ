public class AddressDemo
{
  public static void main(String[] args)
  {
    Address address = new Address("Risdalsvej", "36", "1234", "Aarhus", "Denmark");
    MyDate birthday = new MyDate(29, 6, 1998);
    Person person = new Person("Petra", address, birthday);

    System.out.println(person.getShortAddress());
  }



}
