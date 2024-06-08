package Programmers;

public class Solution12932 {
  public int[] solution(long n) {
    String str = String.valueOf(n);
    StringBuilder stringBuilder = new StringBuilder(str);
    stringBuilder.reverse();

    int[] answer = new int[stringBuilder.length()];
    String[] strings = stringBuilder.toString().split("");

    for (int i = 0; i < answer.length; i++) {
      answer[i] = Integer.parseInt(strings[i]);
    }
    return answer;
  }

  public int[] solution1(long n) {
    String str = new StringBuilder(String.valueOf(n)).reverse().toString();

    int[] answer = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      answer[i] = str.charAt(i) - '0';
    }

    return answer;
  }
}
