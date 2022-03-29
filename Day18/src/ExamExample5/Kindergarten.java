package ExamExample5;

import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> children;

  public Kindergarten() {
    children = new ArrayList<>();
    countTeachers = 0;
  }

  public void addChild(Child child) {
    children.add(child);
  }

  public void removeChild(Child child) {
    children.remove(child);
  }

  public void hireTeacher(int count) {
    countTeachers += count;
  }

  public void fireTeacher() {
    countTeachers -= 1;
  }

  public int countChildren() {
    return children.size();
  }

  public int countTeachers() {
    return countTeachers;
  }

  public double getAverageChildAge() {
    int count = 0;
    int average = 0;
    for (int i = 0; i < children.size(); i++) {
      count += children.get(i).getAge();
    }
    average = count / children.size();
    return average;
  }

  public double getNorm() {
    return children.size() / countTeachers;
  }

  public void celebrateBirthday(String name) {
    for (int i = 0; i < children.size(); i++) {
      if ((children.get(i).getName()).equals(name)) {
        int age = children.get(i).getAge() + 1;
        Child ChildWithNewAge = new Child(name, age);
        children.set(i, ChildWithNewAge);
      }
    }
  }

  public String toString() {
    String str = "";
    for (int i = 0; i< children.size(); i++) {
      str += children.get(i) + "\n";
    }
    return str;
  }
}
