package Exercise2;

public abstract class Animal
{
  private int age;

  public Animal(int age) {
    this.age = age;
  }

  public abstract String speak();

  public String toString() {
    return "Age: " + age;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Animal)) {
      return false;
    }
    Animal other = (Animal) obj;
    return super.equals(other) && age == other.age;

  }
}
