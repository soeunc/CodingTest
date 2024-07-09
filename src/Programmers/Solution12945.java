package Programmers;

public class Solution12945 {
  public int solution(int n) {
    int answer = 0;
    int a = 0;
    int b = 1;
    int mod = 1234567;

    if (n <= 1) {
      return n;
    }
    for (int i = 2; i <= n; i++) {
      answer = (a + b) % mod;
      a = b;
      b = answer;
    }
    return answer;
  }
}
