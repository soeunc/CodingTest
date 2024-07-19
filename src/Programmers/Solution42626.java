package Programmers;

import java.util.PriorityQueue;

public class Solution42626 {
  public int solution(int[] scoville, int K) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    for (int s : scoville) {
      heap.add(s);
    }

    int count = 0;
    while (heap.size() > 1 && heap.peek() < K) {
      int first = heap.poll();
      int second = heap.poll();
      int newSco = first + (second * 2);
      heap.add(newSco);
      count++;
    }
    if (heap.peek() < K) {
      return -1;
    }
    return count;
  }
}
