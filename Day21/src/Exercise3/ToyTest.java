package Exercise3;

public class ToyTest
{
  public static void main(String[] args)
  {
    Lego lego = new Lego(5, 2000);
    Football football = new Football(3, 12);
    Handball handball = new Handball(3, 7);
    Toy[] toys = {lego, football, handball};

    for (int i = 0; i < toys.length;i++) {
      System.out.println(toys[i].play());
    }

  }

}
