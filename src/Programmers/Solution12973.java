package Programmers;

import java.util.Stack;

public class Solution12973 {
  public int solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == c) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }
    if (stack.isEmpty()) {
      return 1;
    } else return 0;
  }
}
