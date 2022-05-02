package OldExam1;

public class Harbor
{
  private String name;
  private String town;

  public Harbor(String name, String town) {
    this.name = name;
    this.town = town;
  }

  public String getName()
  {
    return name;
  }

  public String getTown()
  {
    return town;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setTown(String town)
  {
    this.town = town;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Harbor)) {
      return false;
    }
    Harbor other = (Harbor) obj;
    return name.equals(other.name) && town.equals(other.town);
  }
}
