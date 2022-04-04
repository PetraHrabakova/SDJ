package Workbench3;

public abstract class B
{
  private int m;
  protected int n;

  public B(int m, int n) {
    this.m = m;
    this.n = n;
  }

  public void setM(int m)
  {
    this.m = m;
  }

  public int getM()
  {
    return m;
  }

  public void setN(int n)
  {
    this.n = n;
  }

  public int getN()
  {
    return n;
  }

  public abstract double calc();
}
