package Exercise2;

import Exercise1.Bicycle;

import java.util.ArrayList;

public class Teacher extends Employee
{
  private ArrayList<String> subjects;

  public Teacher(String name, String address, double hours, double payRate, ArrayList<String> subjects) {
    super(name, address, hours, payRate);
    subjects = new ArrayList<>();
  }

  public ArrayList<String> getSubjects() {
    return subjects;
  }

  public void setSubjects(ArrayList<String> subjects) {
    this.subjects = subjects;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < subjects.size(); i++) {
      str += subjects.get(i) + "\n";
    }
    return super.toString() + str;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Teacher)) {
      return false;
    }
    Teacher other = (Teacher) obj;
    return super.equals(other) && subjects.equals(other.subjects);
  }
}
