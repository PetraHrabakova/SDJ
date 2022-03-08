public class ObjectCopy2
{
  public static void main(String[] args)
  {
    Stock company1 = new Stock("W", "123");

    Stock company2 = new Stock(company1);


    if (company1 == company2) {
      System.out.println("The company1 and company2 refer to the same object.");
    }
    else {
      System.out.println("The company1 and company2 variables reference different object.");
    }

  }
}
