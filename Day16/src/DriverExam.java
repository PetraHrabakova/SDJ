public class DriverExam
{
  String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B",
      "A", "C", "D", "B", "C", "D", "A","D",
      "C", "C", "B", "D", "A"};
  String[] userAnswers = new String[20];
  int[] missedAnswers = new int[20];


  public DriverExam(String[] userAnswers) {
    this.userAnswers = userAnswers;
  }

  public boolean passed(){
    int count = 0;
    for (int i = 0; i < correctAnswers.length; i++) {
      if (correctAnswers[i].equals(userAnswers[i])) {
        count += 1;
      }
    }
    if (count >= 15) {
      return true;
    }
    else
      return false;
  }

  public int totalCorrect() {
    int count = 0;
    for (int i = 0; i < correctAnswers.length; i++) {
      if (correctAnswers[i].equals(userAnswers[i])) {
        count += 1;
      }
    }
    return count;
  }

  public int totalIncorrect() {
    int count = 0;
    for (int i = 0; i < correctAnswers.length; i++) {
      if (!(correctAnswers[i].equals(userAnswers[i]))) {
        count += 1;
      }
    }
    return count;
  }

  public int[] questionsMissed() {
    int count = 0;
    for (int i = 0; i < correctAnswers.length; i++) {
      if (!(userAnswers[i].equals("A") || userAnswers[i].equals("B") ||
          userAnswers[i].equals("C") || userAnswers[i].equals("D"))) {
        missedAnswers[count] = i+1;
        count += 1;
      }
    }
    return missedAnswers;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < missedAnswers.length; i++) {
      if (missedAnswers[i] != 0) {
        str += (missedAnswers[i] + ", ");
      }
    }
    return "Missed answers: " + str;
  }

}
