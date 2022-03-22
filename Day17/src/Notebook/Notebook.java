package Notebook;
import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  public Notebook() {
    notes = new ArrayList<Note>(5);
  }

  public Notebook(int maxNumberOfNotes) {
    notes = new ArrayList<Note>(maxNumberOfNotes);
  }

  public int getNumberOfNotes() {
    return notes.size();
  }

  public Note getNote(int index)
  {
    return notes.get(index);
  }

  public String getMessage(int index) {
    return notes.get(index).getMessage();
  }

  public void addNote(Note note) {
     notes.add(note);
  }

  public void addNote(String message) {
    Note newNote = new Note(message);
    notes.add(newNote);
  }

  public void addHighPriorityNote(String message) {
    Note newNote = new Note(message);
    newNote.setToHighPriority();
    notes.add(newNote);
  }

  public void removeNote(int index) {
    if (notes.get(index) != null) {
      notes.remove(index);
    }
  }

  public Note[] getAllNotes() {
    Note[] newNotes = new Note[notes.size()];
    return notes.toArray(newNotes);
  }

  public int getNumberOfHighPriorityNotes() {
    int count = 0;
    for (int i = 0; i < notes.size(); i++) {
      if (notes.get(i).isHighPriority()) {
        count+=1;
      }
    }
    return count;
  }

  public ArrayList<Note> getAllHighPriorityNotes() {
    ArrayList<Note> newNotes = new ArrayList<Note>(getNumberOfHighPriorityNotes());
    for (int i = 0; i < getNumberOfHighPriorityNotes(); i++) {
      if (notes.get(i).isHighPriority()) {
        newNotes.add(notes.get(i));
      }
    }
    return newNotes;
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < notes.size(); i++) {
      str += notes.get(i) + "\n";
    }
    return str + "\nNumber of notes: " + notes.size();
  }
}
