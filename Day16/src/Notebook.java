public class Notebook
{
  int numberOfNotes;
  private Note[] notes;

  public Notebook(int maxNumberOfNotes) {
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes() {
    int count = 0;
    for (int i = 0; i < notes.length; i++) {
      if (notes[i] != null) {
        count += 1;
      }
    }
    return count;
  }

  public Note getNote(int index)
  {
    return notes[index];
  }

  public String getMessage(int index) {
    return notes[index].getMessage();
  }

  public void addNote(Note note) {
      notes[getNumberOfNotes()] = note;
  }

  public void addNote(String message) {
    Note newNote = new Note(message);
    notes[getNumberOfNotes()] = newNote;
  }

  public void addHighPriorityNote(String message) {
    Note newNote = new Note(message);
    newNote.setToHighPriority();
    notes[getNumberOfNotes()] = newNote;

  }

  public void removeNote(int index) {
    if (notes[index] != null) {
      notes[index] = null;
    }
  }

  public Note[] getAllNotes() {
    Note[] newNotes = new Note[getNumberOfNotes()];
    for (int i = 0; i < getNumberOfNotes(); i++) {
      newNotes[i] = notes[i];
    }
    return newNotes;
  }

  public int getNumberOfHighPriorityNotes() {
    int count = 0;
    for (int i = 0; i < getNumberOfNotes(); i++) {
      if (notes[i].isHighPriority()) {
        count+=1;
      }
    }
    return count;
  }

  public Note[] getAllHighPriorityNotes() {
    Note[] newNotes = new Note[getNumberOfHighPriorityNotes()];
    for (int i = 0; i < getNumberOfHighPriorityNotes(); i++) {
      if (notes[i].isHighPriority()) {
        newNotes[i] = notes[i];
      }
    }
    return newNotes;
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < getNumberOfNotes(); i++) {
      str += notes[i] + "\n";
    }
    return str;
  }
}
