package Exam3;

public abstract class Education
{
  private String code;
  private String title;

  public Education(String code, String title) {
    this.code = code;
    this.title = title;
  }

  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Education)) {
      return false;
    }
    Education other = (Education) obj;
    return code.equals(other.code) && title.equals(other.title);
  }

  public String toString() {
    return "Code: " + code + " | Title: " + title;
  }
}
