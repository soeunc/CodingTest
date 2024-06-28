package Programmers;


public class Solution12939 {
  public String solution(String s) {
    String[] strArr = s.split("");
    int min = Integer.parseInt(strArr[0]);
    int max = Integer.parseInt(strArr[0]);

    for (int i = 0; i < strArr.length; i++) {
      int a = Integer.parseInt(strArr[i]);
      if (a < min) {
        min = a;
      }
      if (a > max) {
        max = a;
      }
    }
    return min + " " + max;
  }
}
