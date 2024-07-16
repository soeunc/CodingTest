package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution42587 {
  public int solution(int[] priorities, int location) {
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      queue.add(new int[]{priorities[i], i});
    }

    int order = 0;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      boolean higher = false;

      for (int[] process : queue) {
        if (process[0] > current[0]) {
          higher = true;
          break;
        }
      }
      if (higher) {
        queue.add(current);
      } else {
        order++;
        if (current[1] == location) {
          return order;
        }
      }
    }
    return -1;
  }
}
