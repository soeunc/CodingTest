package Programmers;

public class Solution181892 {
  public int[] solution(int[] num_list, int n) {
    if (n > num_list.length) {
      return new int[0];
    }

    int[] answer = new int[num_list.length - n + 1];

    System.arraycopy(num_list, n -1, answer, 0, num_list.length -n + 1);

    return answer;
  }
}
