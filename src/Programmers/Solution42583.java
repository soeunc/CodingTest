package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution42583 {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int time = 0;
    int totalWeight = 0;
    // 다리 트럭
    Queue<Integer> bridge = new LinkedList<>();

    // 처음엔 다리 위에 트럭이 없다.
    for (int i = 0; i < bridge_length; i++) {
      bridge.add(0);
    }

    int index = 0;

    while (!bridge.isEmpty()) {
      time++;
      totalWeight -= bridge.poll();

      if (index < truck_weights.length) {
        if (totalWeight + truck_weights[index] <= weight) {
          bridge.add(truck_weights[index]);
          totalWeight += truck_weights[index];
          index++;
        } else {
          bridge.add(0);
        }
      }
    }
    return time;
  }
}
