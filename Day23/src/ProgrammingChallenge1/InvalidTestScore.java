package ProgrammingChallenge1;

public class InvalidTestScore extends RuntimeException
{
  public InvalidTestScore() {
    System.out.println("The score array is invalid");
  }
}
