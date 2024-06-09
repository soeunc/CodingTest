package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution12933 {
  public long solution(long n) {
    String str = Long.toString(n);

    Character[] chr = new Character[str.length()];
    for (int i = 0; i < str.length(); i++) {
      chr[i] = str.charAt(i);
    }

    Arrays.sort(chr, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for (char c : chr) {
      sb.append(c);
    }

    return Long.parseLong(sb.toString());
  }
}
