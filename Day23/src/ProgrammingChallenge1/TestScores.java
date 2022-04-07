package ProgrammingChallenge1;

import java.util.ArrayList;

public class TestScores
{
  ArrayList<Integer> testScores;

  public TestScores(ArrayList<Integer> testScores) {
    this.testScores = testScores;
  }

  public void setGrades(ArrayList<Integer> testScores) {
    for(int i = 0; i < testScores.size(); i++) {
      if(testScores.get(i) < 0 || testScores.get(i) > 100) {
        throw new InvalidTestScore();
      }
    }
    this.testScores = testScores;
  }

  public int getAverage(ArrayList<Integer> testScores) {
    int total = 0;
    for (int i = 0; i < testScores.size(); i++) {
      total += testScores.get(i);
    }
    return total / testScores.size();
  }


}

