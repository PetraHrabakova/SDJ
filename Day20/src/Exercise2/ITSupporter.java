package Exercise2;

import Exercise1.Bicycle;

public class ITSupporter extends Employee
{
  private String workArea;

  public ITSupporter(String name, String address, double hours, double payRate, String workArea) {
    super(name, address, hours, payRate);
    this.workArea = workArea;
  }

  public String getWorkArea()
  {
    return workArea;
  }

  public void setWorkArea(String workArea)
  {
    this.workArea = workArea;
  }

  public String toString() {
    return super.toString() +
        "\nWork Area: " + workArea;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof ITSupporter)) {
      return false;
    }
    ITSupporter other = (ITSupporter) obj;
    return super.equals(other) && workArea == other.workArea;
  }
}
