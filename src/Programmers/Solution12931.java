package Programmers;

public class Solution12931 {
  public int solution(int n) {
    int answer = 0;

    String str = Integer.toString(n);

    for (int i = 0; i < str.length(); i++) {
      answer += Integer.parseInt(str.substring(i, i + 1));
    }

    return answer;
  }

  public int solution1(int n) {
    int answer = 0;

    while(n > 0){
      answer += n%10;
      n/=10;
    }
    return answer;
  }
}
