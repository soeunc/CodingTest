package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution12917 {
  public String solution(String s) {
    String answer = "";
    String[] str =  s.split("");
    Arrays.sort(str, Collections.reverseOrder());

    for (String c : str) {
      answer += c;
    }

    return answer;
  }
}
