package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution42586 {
  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> result = new ArrayList<>();

    Queue<Integer> daysQ = new LinkedList<>();
    for (int i = 0; i < progresses.length; i++) {
      int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
      daysQ.add(days);
    }

    while (!daysQ.isEmpty()) {
      int currentDay = daysQ.poll();
      int count = 1;

      while (!daysQ.isEmpty() && daysQ.peek() <= currentDay) {
        daysQ.poll();
        count++;
      }
      result.add(count);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
