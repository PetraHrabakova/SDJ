package ExamExample2;

public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    return red == green && red == blue && blue == green;
  }

  public void mixWith(Colour colour2)
  {
    red =(int)(0.5*red + 0.5*colour2.red);
    green = (int)(0.5*green + 0.5*colour2.green);
    blue = (int)(0.5*blue + 0.5*colour2.blue);
  }

  public Colour copy()
  {
    Colour newColour = new Colour(red, green, blue);
    return newColour;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
    {
      return false;
    }
    Colour other = (Colour)obj;
    return red == other.red && blue == other.blue && green == other.green;
  }

  public String toString()
  {
    return "Red: " + red +
        "\nBlue: " + blue +
        "\nGreen: " + green;
  }

}
