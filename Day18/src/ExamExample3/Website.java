package ExamExample3;

public class Website
{
  String url;
  boolean needsUpdate;

  public Website(String url) {
    this.url = url;
    needsUpdate = false;
  }

  public String getUrl()
  {
    return url;
  }

  public boolean needsUpdate() {
    return needsUpdate;
  }

  public void markAsNotUpdated() {
    needsUpdate = true;
  }

  public void markAsUpdated() {
    needsUpdate = false;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Website)) {
      return false;
    }
    Website other = (Website) obj;
    return url.equals(other.url) && needsUpdate == other.needsUpdate;
  }

  public String toString() {
    return "URL: " + url +
        "\nNeeds update: " + needsUpdate;
  }





}
