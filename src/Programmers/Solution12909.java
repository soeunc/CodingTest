package Programmers;

import java.util.Stack;

public class Solution12909 {
  boolean solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty() || stack.pop() != '(') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
