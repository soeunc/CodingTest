package Programmers;

import java.util.*;

public class Solution12906 {
  public int[] solution(int []arr) {
    Stack<Integer> stack = new Stack<>();

    for (int num : arr) {
      if (stack.isEmpty() || stack.peek() != num) {
        stack.push(num);
      }
    }

    int[] answer = new int[stack.size()];
    for (int i = stack.size() - 1; i >= 0; i--) {
      answer[i] = stack.pop();
    }

//    for (int i = 0; i < answer.length; i++) {
//      int temp = answer[i];
//      answer[i] = answer[answer.length - 1 - i];
//      answer[answer.length - 1 - i] = temp;
//    }
    return answer;
  }
}
