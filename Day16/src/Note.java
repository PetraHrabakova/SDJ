public class Note
{
  String message;
  boolean highPriority;

  Note(String message) {
    this.message = message;
    highPriority = false;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    if (highPriority) {
      return true;
    }
    else
      return false;
  }

  public void setToHighPriority() {
      highPriority = true;

  }

  public void setToLowPriority() {
      highPriority = false;
  }

  public Note copy() {
    Note newNote = new Note(message);
    return newNote;
  }

  public String toString() {
    return "Message: " + message +
        "\nHigh priority: " + highPriority + "\n";
  }
}
