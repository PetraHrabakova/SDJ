public class Player
{
  String name;
  int points;

  public Player(String name) {
    this.name = name;
    points = 50;
  }

  public void minusPoints(Die obj) {
    points-=obj.getValue();
    if (points == 1) {
      System.out.println("Congrats, you win");
    }
    else if (points < 1) {
      points*=-1;
      System.out.println("Oops, the number your rolled was too high.");
      System.out.println("Your new score number is: " + points);
    }
    else
      System.out.println(name + "'s score is: " + points);
  }

}
