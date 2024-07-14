package Programmers;

public class Solution12953 {
  public int solution(int[] arr) {
    int lcmV = arr[0];

    for (int i = 1; i < arr.length; i++) {
      lcmV = lcd(lcmV, arr[i]);
    }
    return lcmV;
  }

  private int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  private int lcd(int a, int b) {
    return (a + b) / gcd(a, b);
  }
}
