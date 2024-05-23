package Programmers;

import java.util.Arrays;

public class Solution42748 {
  public int[] solution(int[] array, int[][] commands) {
    // array에 있는 배열에서 commands배열에 나열되어있는 i,j,k를 기준으로 정렬한것을 answer에 담는다.
    // 첫번째 배열에 있는 값들에서 commands의 0열이 i, 1열이 j, 2열이 k이니까
    // 0-based 인덱싱에 대해서 생각!!

    int[] answer = new int[commands.length];

    for (int c = 0; c < commands.length; c++) {
      int i = commands[c][0];
      int j = commands[c][1];
      int k = commands[c][2];

      int[] newArr = Arrays.copyOfRange(array, i - 1, j);
      Arrays.sort(newArr);
      answer[c] = newArr[k - 1];
    }

    return answer;
  }
}
