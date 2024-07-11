package Programmers;

public class Solution42842 {
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
    int sum = brown + yellow;

    for (int i = 1; i <= sum; i++) {
      if (sum % i == 0) {
        int h = sum / i;
        if ((i - 2) * (h - 2) == yellow) {
          answer[0] = Math.max(i, h);
          answer[1] = Math.min(i, h);
        }
      }
    }
    return answer;
  }
}
