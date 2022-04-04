package Workbench3;

public class D extends B
{
  private double q;
  protected double r;

  public D(int m, int n, double q, double r) {
    super(m, n);
    this.q = q;
    this.r = r;
  }

  public void setR(double r)
  {
    this.r = r;
  }

  public void setQ(double q)
  {
    this.q = q;
  }

  public double getQ()
  {
    return q;
  }

  public double getR()
  {
    return r;
  }

  public double calc() {
    return q * r;
  }
}
