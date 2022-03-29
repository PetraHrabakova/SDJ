package ExamExample4;

public class FileName
{
  private String name;
  private String extension;

  public FileName(String name, String extension) {
    this.name = name;
    this.extension = extension;
  }

  public void set(String name, String extension) {
    this.name = name;
    this.extension = extension;
  }

  public String getName()
  {
    return name;
  }

  public String getExtension()
  {
    return extension;
  }

  public String getFullName() {
    return "Name: " + name;
  }

  public FileName copy() {
    FileName newFile = new FileName(name, extension);
    return newFile;
  }
}
