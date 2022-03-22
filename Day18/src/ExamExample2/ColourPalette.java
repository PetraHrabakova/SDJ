package ExamExample2;
import java.util.ArrayList;

public class ColourPalette
{
  private ArrayList<Colour> colours;
  private int numberOfColours;

  public ColourPalette(int maxNumberOfColours) {
    colours = new ArrayList<Colour>();
    numberOfColours = maxNumberOfColours;
  }

  public int getNumberOfColours() {
    return colours.size();
  }

  public void add(Colour colour) {
    if (colours.size() < numberOfColours) {
      colours.add(colour.copy());
    }
  }

  public Colour get(int index) {
    return colours.get(index).copy();
  }

  public int getNumberofGrayColours() {
    int count = 0;
    for (int i = 0; i < colours.size(); i++) {
      if (colours.get(i).isGray()) {
        count += 1;
      }
    }
    return count;
  }

  public void mixColour(int index, Colour colour2) {
    colours.get(index).mixWith(colour2);
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof ColourPalette)) {
      return false;
    }

    ColourPalette other = (ColourPalette)obj;
    return colours.equals(other.colours);
  }

  public String toString() {
    String str = "";
     for (int i = 0; i < colours.size(); i++) {
       str += colours.get(i);
     }
     return str;
  }



}
