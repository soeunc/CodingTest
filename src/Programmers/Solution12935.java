package Programmers;

public class Solution12935 {
  public int[] solution(int[] arr) {
    if (arr.length <= 1) {
      return new int[]{-1};
    }

    int minValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minValue) {
        minValue = arr[i];
      }
    }

    int[] answer = new int[arr.length - 1];
    int index = 0;

    for (int j : arr) {
      if (j != minValue) {
        answer[index++] = j;
      }
    }
    return answer;
  }
}
