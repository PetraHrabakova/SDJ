public class Person
{
  private String name;
  private String address;
  MyDate birthday;

  public Person(String name, String address, MyDate birthday) {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
  }

  public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = birthday.copy();
  }

  public Person(MyDate birthday) {
    this.birthday = birthday.copy();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge() {
    int age = 0;
    if ((birthday.currentMonth > birthday.month) || (birthday.currentMonth == birthday.month && birthday.currentDay >= birthday.day)) {
      age = birthday.currentYear - birthday.year;
      return age;
    }
    else {
      age = (birthday.currentYear - birthday.year) - 1;
      return age;
    }
  }

  public String toString() {
    return "Name: " + name +
        "\nAddress: " + address +
        "\nBirthday: " + birthday;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Person)) {
      return false;
    }
    Person other = (Person)obj;
    return name.equals(other.name) && address.equals(other.address) && birthday == other.birthday;
  }


}

