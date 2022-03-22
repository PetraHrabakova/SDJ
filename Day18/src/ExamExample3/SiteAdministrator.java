package ExamExample3;

import java.util.ArrayList;

public class SiteAdministrator
{
  String name;
  SiteCollection siteCollection;

  public SiteAdministrator(String name) {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
  public SiteCollection getSiteCollection() {
    return siteCollection;
  }
}
