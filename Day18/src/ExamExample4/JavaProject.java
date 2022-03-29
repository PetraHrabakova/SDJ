package ExamExample4;

import java.util.ArrayList;

public class JavaProject
{
  private String name;
  private ArrayList<JavaFile> files;

  public JavaProject(String name) {
    files = new ArrayList<>();
  }

  public void addJavaFile(JavaFile file) {
    files.add(file);
  }

  public FileName getFileName(int index) {
    return files.get(index).getFileName();
  }

  public JavaFile getFirstJavaFileWithAMainMethod() {
    JavaFile fileWithMainMethod = new JavaFile("");
    for (int i = 0; i < files.size(); i++) {
      if (files.get(i).hasAMainMethod()) {
        fileWithMainMethod = files.get(i);
      }
    }
    return fileWithMainMethod;
  }
}
