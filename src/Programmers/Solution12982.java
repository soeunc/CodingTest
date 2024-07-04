package Programmers;

import java.util.Arrays;

public class Solution12982 {
  public int solution(int[] d, int budget) {
    int answer = 0;
    int count = 0;

    Arrays.sort(d);
    for (int i = 0; i < d.length; i++) {
      if (answer + d[i] > budget) {
        break;
      }
      answer += d[i];
      count++;
    }
    return count;
  }
}
