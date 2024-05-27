package Programmers;

public class Solution181891 {
  public int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length];

    // n 이후 원소들
    for (int i = 0; i < num_list.length - n; i++) {
      answer[i] = num_list[n + i];
    }

    // n까지 원소들
    for (int i = 0; i < n; i++) {
      answer[num_list.length - n + i] = num_list[i];
    }

    return answer;
  }
}
