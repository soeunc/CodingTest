package Programmers;

public class Solution12912 {
  public long solution(int a, int b) {
    long answer = 0;

    int size = Math.abs(b - a) + 1;
    int[] result = new int[size];

    int start = Math.min(a, b);

    for (int i = 0; i < size; i++) {
      result[i] = start + i;
    }
    for (int j : result) {
      answer += j;
    }
    return answer;
  }
}
