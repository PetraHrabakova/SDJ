public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    if (!isBrainDamaged()) {
      int a = activeMemoryItem.length();
      int p1 = passiveMemoryItemOne.length();
      int p2 = passiveMemoryItemTwo.length();

      if ( a < 10 || p1 < 10 || p2 < 10)
      {
        return 70;
      }
      else if (a <= 10 && p1 <= 10 && p2 <= 10)
        return 100;
      else if ((a > 20 && p1 > 10 && p2 > 10) || (p1 > 20 && a > 10 && p2 > 10)
          || (p2 > 20 && a > 10 && p1 > 10))
      {
        return 130;
      }
    }
    return 70;
  }

  public boolean isBrainDamaged() {
    return passiveMemoryItemOne == null || passiveMemoryItemTwo == null
        || activeMemoryItem == null;
  }

  public void remember(String info) {
    this.passiveMemoryItemTwo = passiveMemoryItemOne;
    this.passiveMemoryItemOne = activeMemoryItem;
    this.activeMemoryItem = info;
  }

  public void refreshMemory(String info) {
    if (passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info)) {
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }
  }

  public boolean recall(String info) {
    return activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info)
        || passiveMemoryItemTwo.equals(info);
  }

  public String recall() {
    return activeMemoryItem;
  }

  public String toString() {
    return "Active memory item: " + activeMemoryItem +
        "Passive memory item 1: " + passiveMemoryItemOne +
        "Passive memory item 2: " + passiveMemoryItemTwo +
        "IQ: " + getIQ();
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Brain)) {
      return false;
    }
    Brain other = (Brain)obj;
    return activeMemoryItem.equals(other.activeMemoryItem) &&
        passiveMemoryItemOne.equals(other.passiveMemoryItemOne) &&
        passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }

}
