package Question1;

public abstract class Note
{
  private String message;

  public Note(String message) {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  // Abstract method (no body)
  public abstract Note copy();


  public String toString() {
    return "Message: " + message;
  }
}
