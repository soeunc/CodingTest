package Programmers;

import java.util.HashMap;

public class Solution176963 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    HashMap<String, Integer> nameYearning = new HashMap<>();
    for (int i = 0; i < name.length; i++) {
      nameYearning.put(name[i], yearning[i]);
    }

    int[] answer = new int[photo.length];
    for (int i = 0; i < photo.length; i++) {
      int score = 0;
      for (String person : photo[i]) {
        score += nameYearning.getOrDefault(person, 0);
      }
      answer[i] = score;
    }
    return answer;
  }
}
