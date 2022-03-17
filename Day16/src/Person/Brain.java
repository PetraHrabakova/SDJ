package Person;

public class Brain
{
  private String[] memory = new String[3];

  public Brain()
  {
    memory[0] = "";
    memory[1] = "";
    memory[2] = "";
  }

  public int getIQ()
  {
    if (!isBrainDamaged()) {
      int a = memory[0].length();
      int p1 = memory[1].length();
      int p2 = memory[2].length();

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
    return memory[1] == null || memory[2] == null
        || memory[0] == null;
  }

  public void remember(String info) {
    this.memory[2] = memory[1];
    this.memory[1] = memory[0];
    this.memory[0] = info;
  }

  public void refreshMemory(String info) {
    if (memory[1].equals(info) || memory[2].equals(info)) {
      memory[1] = memory[0];
      memory[0] = info;
    }
  }

  public boolean recall(String info) {
    return memory[0].equals(info) || memory[1].equals(info)
        || memory[2].equals(info);
  }

  public String recall() {
    return memory[0];
  }

  public String toString() {
    return "Active memory item: " + memory[0] +
        "Passive memory item 1: " + memory[1] +
        "Passive memory item 2: " + memory[2] +
        "IQ: " + getIQ();
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Brain)) {
      return false;
    }
    Brain other = (Brain)obj;
    return memory[0].equals(other.memory[0]) &&
        memory[1].equals(other.memory[1]) &&
        memory[2].equals(other.memory[2]);
  }

}
