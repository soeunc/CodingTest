package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution42840 {
  public int[] solution(int[] answers) {
    int[] first = {1, 2, 3, 4, 5};
    int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] count = new int[3];

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == first[i % first.length]) {
        count[0]++;
      }
      if (answers[i] == second[i % second.length]) {
        count[1]++;
      }
      if (answers[i] == third[i % third.length]) {
        count[2]++;
      }
    }
    int max = Math.max(count[0], Math.max(count[1], count[2]));

    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < count.length; i++) {
      if (count[i] == max) {
        answer.add(i + 1);
      }
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}
