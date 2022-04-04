package Exercise3;

public class Lego extends Toy
{
  private int numberOfBricks;

  public Lego(int suitableAge, int numberOfBricks) {
    super(suitableAge);
    this.numberOfBricks = numberOfBricks;
  }

  public String play() {
    return "Build";
  }

  public String toString() {
    return super.toString() +
        "\nNumber of bricks: " + numberOfBricks;
  }
}
