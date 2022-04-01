package Exercise4;

import java.util.ArrayList;

public class CircleList
{
  ArrayList<Circle> circles;
  int capacity;

  public CircleList(int capacity) {
    circles = new ArrayList<>();
  }

  public int getNumberOfCircles() {
    return circles.size();
  }

  public void addCircle(Circle circle) {
    if (circles.size() < capacity)
    {
      circles.add(circle);
    }
  }

  public Circle getCircle(int index) {
    return circles.get(index);
  }

  public double getTotalArea() {
    double total = 0;
    for (int i = 0; i < circles.size(); i++) {
      total += (circles.get(i)).getArea();
    }
    return total;
  }

  public double getAverageArea() {
    double total = 0;
    for (int i = 0; i < circles.size(); i++) {
      total += (circles.get(i)).getArea();
    }
    return total / circles.size();
  }
}
