package Exam3;

public class School extends Education
{
  private String type;
  public static String INFANT_SCHOOL = "Infant school";
  public static String JUNIOR_SCHOOL = "Junior school";
  public static String SECONDARY_SCHOOL = "Secondary school";
  public static String HIGH_SCHOOL = "High school";

  public School(String code, String title, String type) {
    super(code, title);
    this.type = type;
  }

  public String getSchoolType() {
    return type;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof School)) {
      return false;
    }
    School other = (School) obj;
    return super.equals(other) && type.equals(other.type);
  }

  public String toString() {
    return super.toString() + " | Type: " + type;
  }
}
