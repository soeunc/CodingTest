package Programmers;

public class Solution12934 {
  public long solution(long n) {
    long answer = (long) Math.sqrt(n);
    if (answer * answer == n) {
      return  (answer + 1) * (answer + 1);
    } else {
      return -1;
    }
  }
}
