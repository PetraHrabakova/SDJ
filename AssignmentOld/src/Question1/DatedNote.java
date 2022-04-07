package Question1;

public class DatedNote extends Note
{
  private MyDate date;


  public DatedNote(String message, MyDate date) {
    super(message);
    this.date = date.copy();

  }

  public MyDate getDate()
  {
    return date.copy();
  }

  public Note copy() {
    // Not creating Note object but DatedNote because it's basically Note
    Note newNote = new DatedNote(getMessage(), date);
    return newNote;
  }

  public String toString() {
    return date + super.toString();
  }

}
