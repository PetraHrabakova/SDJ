package ExamExample1;

public class Service
{
  private Date date;
  private int mileage;

  public Service(int mileage, Date date) {
    this.mileage = mileage;
    this.date = date.copy();
  }

  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Service)) {
      return false;
    }
    Service other = (Service) obj;
    return mileage == other.mileage && date.equals(other.date);
  }

  public String toString() {
    return "Mileage: " + mileage + "\n" + date.copy();
  }

}
