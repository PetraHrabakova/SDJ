import java.util.Scanner;

public class Game
{
  public static void main(String[] args)
  {
    // Create scanner object
    Scanner sc = new Scanner(System.in);
    // Get name of players
    System.out.println("Name of player 1: ");
    String name1 = sc.nextLine();
    System.out.println("Name of player 2: ");
    String name2 = sc.nextLine();

    // Create objects for players
    Player player1 = new Player(name1);
    Player player2 = new Player(name2);

    System.out.println("Let's play!");
    System.out.println("Enter Y or N to roll: ");
    String answer = sc.nextLine();

    // As long as the players want to play, the game will execute
    while (answer.equals("y") || answer.equals("Y")) {
      Die die1 = new Die(6);
      Die die2 = new Die(6);
      player1.minusPoints(die1);
      player2.minusPoints(die2);
      System.out.println("Do you want to roll again? ");
      answer = sc.nextLine();
  }
    // If they press N, the game terminates
    System.out.println("Okie, bye.");
  }

}
