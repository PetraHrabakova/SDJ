public class PersonDemo
{
  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(29,6,1998);
    Person me = new Person("Petra", "whatever", birthday);

    System.out.println(me.getAge());
  }
}
