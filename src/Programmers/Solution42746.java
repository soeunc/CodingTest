package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution42746 {
  public String solution(int[] numbers) {
    String[] numStr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);

    Arrays.sort(numStr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        String a = o1 + o2;
        String b = o2 + o1;
        return b.compareTo(a);
      }
    });

    String result = String.join("", numStr);
    if (result.charAt(0) == '0') {
      return "0";
    }
    return result;
  }
}
