package Exercise2;

public class ExchangeStudent extends Student
{
  private String nationality;

  public ExchangeStudent(String name, String address, int studentNo, String nationality) {
    super(name, address, studentNo);
    this.nationality = nationality;
  }

  public String getNationality()
  {
    return nationality;
  }

  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

  public String toString() {
    return super.toString() +
        "\nNationality: " + nationality;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof ExchangeStudent)) {
      return false;
    }
    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && nationality.equals(other.nationality);
  }
}
