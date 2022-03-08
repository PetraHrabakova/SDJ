public class SalesCommission
{
  double sales;
  double rate;
  double commission;
  double advance;
  double pay;

  public SalesCommission(double s, double a) {
    advance = a;
    sales = s;
    calculatePay();
  }
  public void setRate() {
    if (sales < 10000)
      rate = 0.05;
    else if (sales < 15000)
      rate = 0.1;
    else if (sales < 18000)
      rate = 0.12;
    else if (sales < 22000)
      rate = 0.14;
    else
      rate = 0.16;
  }

  public double getPay() {
    return pay;
  }

  public double getAdvance()
  {
    return advance;
  }

  public double getCommission()
  {
    return commission;
  }

  public double getRate()
  {
    return rate;
  }

  public double getSales()
  {
    return sales;
  }

  private void calculatePay() {
    setRate();
    commission = sales * rate;
    pay = commission-advance;
  }
}
