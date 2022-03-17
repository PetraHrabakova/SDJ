public class Rainfall
{
  int months = 12;
  double[] rainfalls = new double[months];

  public Rainfall(double[] rainfalls) {
    this.rainfalls = rainfalls;
  }

  public double totalRainfalls() {
    double sum = 0;
    for (int i = 0; i<= months-1; i++) {
      sum+=rainfalls[i];
    }
    return sum;
  }

  public double averageRainfalls() {
    double average = 0;
    average = totalRainfalls() / months;
    return average;
  }

  public double mostRain() {
    double monthWithMostRain = rainfalls[0];
    for (int i = 0; i <= months-1; i++) {
      if (rainfalls[i] > monthWithMostRain) {
        monthWithMostRain = rainfalls[i];
      }
    }
    return monthWithMostRain;
  }

  public double leastRain() {
    double monthWithLeast = rainfalls[0];
    for (int i = 0; i <= months-1; i++) {
      if (rainfalls[i] < monthWithLeast) {
        monthWithLeast = rainfalls[i];
      }
    }
    return monthWithLeast;
  }






}
