package Person;

public class Person
{
  private String name;
  private MyDate birthday;
  private Brain brain;
  private Address address;

  public Person(String name, Address address, MyDate birthday) {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    brain = new Brain();
  }

  public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = birthday.copy();
    brain = new Brain();
  }

  public Person(MyDate birthday) {
    this.birthday = birthday.copy();
    brain = new Brain();
    name = "";
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Address getAddress()
  {
    return address;
  }

  public String getShortAddress() {
    return "Street and number: " + address.getStreet() + " " + address.getNumber();
  }


  public void setAddress(Address address)
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

  public int getIQ() {
    return brain.getIQ();
  }

  public boolean isBrainDamaged() {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic) {
    if (!(brain.isBrainDamaged())) {
      return brain.recall(topic);
      }
    return false;
    }

  public void rememberThis(String topic) {
    if (doYouRemember(topic)) {
      brain.refreshMemory(topic);
    }
    else {
      brain.remember(topic);
    }
  }

  public String whatAreYouThinkingAbout() {
    return brain.recall();
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

