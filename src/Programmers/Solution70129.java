package Programmers;

public class Solution70129 {
  public int[] solution(String s) {
    int count = 0;
    int removeCount = 0;

    while (!s.equals("1")) {
      int length = s.length();
      s = s.replace("0", "");
      int newLength = s.length();

      removeCount += length - newLength;

      s = Integer.toBinaryString(newLength);
      count++;
    }
    return new int[]{count, removeCount};
  }
}
