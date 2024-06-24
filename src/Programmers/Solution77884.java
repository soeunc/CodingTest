package Programmers;

public class Solution77884 {
  public int solution(int left, int right) {
    int sum = 0;

    for (int i = left; i <= right; i++) {
      int div = divisors(i);
      if (div % 2 == 0) {
        sum += i;
      } else {
        sum -= i;
      }
    }
    return sum;
  }

  private int divisors(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    return count;
  }

  public int solution1(int left, int right) {
    int answer = 0;
    for(int i=left; i<=right; i++){
      int cnt = 0;
      for(int j=1; j<=i; j++){
        if(i%j==0) cnt++;
      }
      if(cnt%2==0) answer += i;
      else answer -= i;
    }
    return answer;
  }
}
