package Programmers;

public class Solution86491 {
  public int solution(int[][] sizes) {
    int maxW = 0;
    int maxH = 0;

    for (int[] s : sizes) {
      int width = Math.max(s[0], s[1]);
      int height = Math.min(s[0], s[1]);

      if (width > maxW) {
        maxW = width;
      }
      if (height > maxH) {
        maxH = height;
      }
    }
    return maxW * maxH;
  }
}
