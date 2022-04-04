package Exercise2;

public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age, String name) {
    super(age, name);
  }

  public String speak() {
    return "Meow";
  }

  public String toString() {
    return super.toString() +
        "\nIs a house cat: " + isAHouseCat;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Cat)) {
      return false;
    }
    Cat other = (Cat) obj;
    return super.equals(other) && isAHouseCat == other.isAHouseCat;


  }
}
