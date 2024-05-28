package Programmers;

public class Solution181887 {
  public int solution(int[] num_list) {
    int evenSum = 0;
    int oddSum = 0;

    for (int i = 1; i <= num_list.length; i++) {
      if (i % 2 == 0) {
        evenSum += num_list[i - 1];
      } else {
        oddSum += num_list[i - 1];
      }
    }
    return Math.max(evenSum, oddSum);
  }
}
