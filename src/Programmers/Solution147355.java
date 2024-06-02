package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution147355 {
  public int solution(String t, String p) {
    List<String> subs = new ArrayList<>();
    // 슬라이딩 윈도우를 사용하여 모든 부분 문자열을 추출할 때 유효한 마지막 시작 인덱스를 계산
    for (int i = 0; i <= t.length() - p.length(); i++) {
      String sub = t.substring(i, i + p.length());
      if (sub.compareTo(p) <= 0) {
        subs.add(sub);
      }
    }
    return subs.size();
  }
}
