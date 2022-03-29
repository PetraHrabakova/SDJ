package ExamExample4;

import java.lang.reflect.Field;

public class JavaFile
{
  private boolean hasAMainMethod;
  private FileName fileName;

  public JavaFile(String fileName) {
    this.fileName = new FileName(fileName, "java");
    hasAMainMethod = false;
  }

  public FileName getFileName() {
    return fileName.copy();
  }

  public boolean hasAMainMethod() {
    return hasAMainMethod;
  }

  public void addAMainMethod() {
    hasAMainMethod = true;
  }

  public String toString() {
    return fileName +
        "\nHas a main method: " + hasAMainMethod;
  }






}
