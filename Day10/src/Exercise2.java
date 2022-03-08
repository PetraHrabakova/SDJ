public class Exercise2
{
  public static void main(String[] args)
  {
    int chessboard = 8*8;
    double a = 2;
    double b = 1;
    double c = 0;

    for (int i = 1; i <= chessboard; i++) {
      b*=a;       // b = b*2 - value on each square
      c+=b;       // c = c+b - adding all values together
      if (i == chessboard) {
        System.out.println("Grains at last square of the chessboard: " + b);
      }
    }
    System.out.println("Total amount of grains: " + c);





  }



}
