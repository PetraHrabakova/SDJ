import java.util.ArrayList;
import java.util.Random;

public class Lottery
{
  private ArrayList<Integer> lotteryNumbers;
  private ArrayList<Integer> userAnswers = new ArrayList<Integer>(5);
  Random rn = new Random();

  public Lottery()
  {
    lotteryNumbers = new ArrayList<Integer>(5);
    for (int i = 0; i < 5; i++)
    {
      lotteryNumbers.add(i, rn.nextInt(9));
    }
  }

  public void setUserPicks(ArrayList<Integer> userAnswers)
  {
    this.userAnswers = userAnswers;
  }


  public String matchingNumber()
  {
    String str = "";
    int count = 0;

    for (int i = 0; i < lotteryNumbers.size(); i++)
    {
      if (lotteryNumbers.get(i).equals(userAnswers.get(i)))
      {
        str += lotteryNumbers.get(i) + " ";
        count += 1;
        if (count == 5) {
          return "WOOHOO! YOU GUESSED EVERYTHING RIGHT!" + "\nRight answers: " + str;
        }
      }
    }
    if (str.equals("")) {
      return "You guessed nothing right";
    }
    return str;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < lotteryNumbers.size(); i++) {
      str += lotteryNumbers.get(i) + " ";
    }
    return "The lottery numbers are: " + str;
  }
}
