package Question1;

public class PriorityNote extends Note
{
  private int priority;

  public PriorityNote(String message, int priority) {
    super(message);
    this.priority = priority;
  }

  public int getPriority()
  {
    return priority;
  }

  public Note copy() {
    Note newNote = new PriorityNote(getMessage(), priority);
    return newNote;
  }

  public String toString() {
    return super.toString() +
        "\nPriority: " + priority;
  }

}
