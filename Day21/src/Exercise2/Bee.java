package Exercise2;

public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age, boolean isAHoneyBee) {
    super(age);
    this.isAHoneyBee = isAHoneyBee;
  }

  public String speak() {
    return "Bzzz";
  }

  public String toString() {
    return super.toString() +
        "\nIs a honey bee: " + isAHoneyBee;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Bee)) {
      return false;
    }
    Bee other = (Bee) obj;
    return super.equals(other) && isAHoneyBee == other.isAHoneyBee;
  }
}
