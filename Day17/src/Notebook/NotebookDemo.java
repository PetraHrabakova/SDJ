package Notebook;

public class NotebookDemo
{
  public static void main(String[] args)
  {
    Notebook notebook = new Notebook(13);
    Note note1 = new Note("Helloo");
    Note note2 = new Note("How are you");
    Note note3 = new Note("What is your name");
    Note note4 = note1.copy();

    note1.setToHighPriority();
    note2.setToLowPriority();
    note3.setToHighPriority();
    note4.setToLowPriority();

    notebook.addNote(note1);
    notebook.addNote(note2);
    notebook.addNote(note3);
    notebook.addNote(note4);

    notebook.addNote("New message");
    notebook.addHighPriorityNote("High priority note");

    // notebook.removeNote(2);    - works

    System.out.println(notebook);

  }
}
