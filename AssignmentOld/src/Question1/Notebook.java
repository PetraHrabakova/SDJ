package Question1;

import java.util.ArrayList;

public class Notebook
{
  private ArrayList<Note> notes;
  private int numberOfNotes;

  public Notebook(int maxNumberOfNotes) {
    numberOfNotes = maxNumberOfNotes;
    notes = new ArrayList<Note>();
  }

  public void addNote(Note note) {
    if (notes.size() < numberOfNotes) {
      notes.add(note);
    }
  }

  public void setNote(Note note, int index) {
    notes.set(index, note);
  }

  public void removeNote(int index) {
    notes.remove(index);
  }

  public Note getNote(int index) {
    return notes.get(index).copy();
  }

  public int getNumberOfPriorityNotes() {
    int total = 0;
    for (int i = 0; i < notes.size(); i++) {
      if (notes.get(i) instanceof PriorityNote) {
          total++;
      }
    }
    return total;
  }

  public PriorityNote[] getPriorityNotes()
  {
    PriorityNote[] priorityNotes = new PriorityNote[getNumberOfPriorityNotes()];
    int index = 0;

    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) instanceof PriorityNote)
      {
        if (((PriorityNote) notes.get(i)).getPriority() == 1)
        {
          priorityNotes[index++] = (PriorityNote) notes.get(i);
        }
      }
    }

    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) instanceof PriorityNote)
      {
        if (((PriorityNote) notes.get(i)).getPriority() == 2)
        {
          priorityNotes[index++] = (PriorityNote) notes.get(i);
        }
      }
    }

    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) instanceof PriorityNote)
      {
        if (((PriorityNote) notes.get(i)).getPriority() == 3)
        {
          priorityNotes[index++] = (PriorityNote) notes.get(i);
        }
      }
    }


    // Smart solution
    /*
    for (int priority = 1; priority <= 3; priority++)
    {
      for (int i = 0; i < notes.size(); i++)
      {
        if (notes.get(i) instanceof PriorityNote)
        {
          if (((PriorityNote) notes.get(i)).getPriority() == priority)
          {
            priorityNotes[index++] = (PriorityNote) notes.get(i);
          }
        }
      }
    }
    */

    return priorityNotes;
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < notes.size(); i++) {
      str += notes.get(i) + "\n";
    }
    return str;
  }
}
