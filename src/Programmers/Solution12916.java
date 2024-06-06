package Programmers;

public class Solution12916 {
  boolean solution(String s) {
    boolean answer = true;

    char[] str = s.toCharArray();
    int sumA = 0;
    int sumB = 0;
    for (int i = 0; i < str.length; i++) {
      if (str[i] == 'p' || str[i] == 'P') {
        sumA += 1;
      } else if (str[i] == 'y' || str[i] == 'Y') {
        sumB += 1;
      }
      if (sumA == sumB) answer = true;
      else answer = false;
    }
    return answer;
  }
}
