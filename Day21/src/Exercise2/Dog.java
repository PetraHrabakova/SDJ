package Exercise2;

public class Dog extends Pet
{
  private String breed;

  public Dog(int age, String name, String breed) {
    super(age, name);
    this.breed = breed;
  }

  public String speak() {
    return "Woof";
  }

  public String toString() {
    return super.toString() +
        "\nDog breed: " + breed;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Dog)) {
      return false;
    }
    Dog other = (Dog) obj;
    return super.equals(other) && breed.equals(other.breed);
  }

}
