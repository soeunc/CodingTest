package Programmers;

import java.util.Stack;

public class Solution42584 {
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < prices.length; i++) {
      while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
        int index = stack.pop();
        answer[index] = i - index;
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      int index = stack.pop();
      answer[index] = prices.length - index - 1;
    }
    return answer;
  }
}
