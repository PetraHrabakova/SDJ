package Exercise2;

public class Frog extends Animal
{
  private String colour;

  public Frog(int age, String colour) {
    super(age);
    this.colour = colour;
  }

  public String speak() {
    return "Ribbit";
  }

  public String toString() {
    return super.toString() +
        "\nColour: " + colour;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Frog)) {
      return false;
    }
    Frog other = (Frog) obj;
    return super.equals(other) && colour.equals(other.colour);


  }
}
