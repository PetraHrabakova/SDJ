import java.util.ArrayList;
import java.util.Scanner;

public class LotteryDemo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Lottery lotteryNumbers = new Lottery();
    ArrayList<Integer> userPicks = new ArrayList<Integer>(5);
    int count = 0;

    while(count < 5) {
      System.out.println("Enter your number: ");
      int userNumber = sc.nextInt();
      userPicks.add(userNumber);
      count +=1;
    }

    lotteryNumbers.setUserPicks(userPicks);

    System.out.println(lotteryNumbers.matchingNumber());
    System.out.println(lotteryNumbers);
  }
}
