public class GradeList
{
  private Grade[] gradesArray;

  public GradeList(int numberOfGrades)
  {
    gradesArray = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    int count = 0;
    for (int i = 0; i < gradesArray.length; i++)
    {
      if (gradesArray[i] != null)
      {
        count += 1;
      }

    }
    return count;

  }

  public Grade getGrade(int index)
  {
    return gradesArray[index];
  }

  public void setGrade(Grade grade, int index)
  {
    this.gradesArray[index] = grade;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < gradesArray.length; i++)
    {
      str += gradesArray[i] + "\n";
    }
    return str;
  }
}
