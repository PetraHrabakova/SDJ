public class Person
{
  String name;
  String birthday;

  public Person(String number, String birthday) {
    this.name = number;
    this.birthday = birthday;
  }

  // The setLength method accepts an argument that
  // is stored in the length field
  public void setName(String n) {
    name = n;
  }

  // The setWidth method accepts an argument
  // that is stored in the width field
  public void setBirthday(String birth) {
    birthday = birth;
  }

  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }

  public String toString() {
    return "Name: " + name + "\nBirthday: " + birthday;
  }

}
