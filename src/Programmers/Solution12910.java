package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12910 {
  public int[] solution(int[] arr, int divisor) {
    List<Integer> arrList = new ArrayList<>();

    for (int i : arr) {
      if (i % divisor == 0) {
        arrList.add(i);
      }
    }

    if (arrList.isEmpty()) {
      return new int[]{-1};
    } else {
      int[] answer = arrList.stream().mapToInt(i -> i).toArray();
      Arrays.sort(answer);
      return answer;
    }
  }
}
