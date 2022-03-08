public class Temperature
{
  double ftemp;

  public Temperature(double ftemp) {
    this.ftemp = ftemp;
  }

  public void setFahrenheit(double ftemp) {
    this.ftemp = ftemp;
  }

  public double getFahrenheit() {
    return ftemp;
  }

  public double getCelcius() {
    ftemp = (ftemp-32)*5556;
    return ftemp;
  }

  public double getKelvin() {
    ftemp = ((ftemp-32)*5/9)+273;
    return ftemp;
  }

  public String toString() {
    return "Temperature converted: " + ftemp;
  }


}

