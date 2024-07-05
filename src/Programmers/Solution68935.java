package Programmers;

public class Solution68935 {
  public int solution(int n) {
    String ten = Integer.toString(n, 3);
    String revere = new StringBuilder(ten).reverse().toString();
    int answer = Integer.parseInt(revere, 3);
    return answer;
  }
}
