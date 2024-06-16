package Programmers;

public class Solution86051 {
  public int solution(int[] numbers) {
    int answer = 0;
    // 0~9 총 합은 45
    for (int i = 0; i < numbers.length; i++) {
      answer += numbers[i];
    }
    return 45 - answer;
  }
}
