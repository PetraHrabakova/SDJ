package ExamExample3;

import java.util.ArrayList;

public class SiteCollection
{
  int size;
  ArrayList<Website> webSite;

  public SiteCollection(int maxSites) {
    webSite = new ArrayList<Website>();
    size = maxSites;
  }

  public int getNumberOfSites() {
    return webSite.size();
  }

  public int getNumberOfUpdatedSites() {
    int count = 0;
    for (int i = 0; i < webSite.size(); i++) {
      if (!webSite.get(i).needsUpdate()) {
        count += 1;
      }
    }
    return count;
  }

  public void addSite(Website site) {
    if (webSite.size() < size) {
      webSite.add(site);
    }
  }

  public void removeSite(String url) {
    for (int i = 0; i < webSite.size(); i++) {
      if ((webSite.get(i).getUrl()).equals(url)) {
        webSite.remove(i);
        break;
      }
    }
  }

  public Website[] getAllSites() {
    Website[] newArray = new Website[webSite.size()];
    return webSite.toArray(newArray);
  }

  public Website[] getAllNotUpdatedWebsites() {
    Website[] newArray = new Website[webSite.size()];

    for (int i = 0; i < webSite.size(); i++) {
      if(webSite.get(i).needsUpdate) {
        newArray[i] = webSite.get(i);
      }
    }
    return newArray;
  }

  public String toString() {
    String str = "";
    for(int i = 0; i < webSite.size(); i++) {
      str += webSite.get(i);
    }
    return str;
  }
}
