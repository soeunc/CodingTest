package Programmers;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution42576 {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

    // 참가자 이름(키), 등장 횟수(값) 추가
    for (int i = 0; i < participant.length; i++) {
      if (map.containsKey(participant[i])) {
        map.put(participant[i], map.get(participant[i]) + 1);
      } else {
        map.put(participant[i], 1);
      }
    }

    // 완주한 사람(키), 등장 횟수(값) 제거
    for (int i = 0; i < completion.length; i++) {
      if (map.containsKey(completion[i])) {
        if (map.get(completion[i]) == 1) {
          map.remove(completion[i]);
        } else {
          map.replace(completion[i], map.get(completion[i]) - 1);
        }
      }
    }

    Set<String> set = map.keySet();
    for (String key : set) {
      answer = key;
    }

    return answer;
  }
}
