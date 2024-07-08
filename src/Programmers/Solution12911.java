package Programmers;

public class Solution12911 {
  public int solution(int n) {
    int answer = n + 1;
    int count = Integer.bitCount(n);

    while (Integer.bitCount(answer) != count) {
      answer++;
    }
    return answer;
  }
}
