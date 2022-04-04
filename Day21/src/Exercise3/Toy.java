package Exercise3;

public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge) {
    this.suitableAge = suitableAge;
  }

  public abstract String play();

  public String toString() {
    return "Suitable age: " + suitableAge;
  }
}
