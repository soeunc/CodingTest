package Programmers;

public class Solution82612 {
  public long solution(int price, int money, int count) {
    long sum = 0;

    for (int i = 1; i <= count; i++) {
      sum += (long) price * i;
    }
    if (sum - money == 0) {
      return 0;
    } else if (sum < money) {
      return 0;
    } else {
      return Math.abs(sum - money);
    }
  }
}
