package Programmers;

import java.util.HashMap;

public class Solution178871 {
  public String[] solution(String[] players, String[] callings) {
    // 선수들의 현재 등수를 저장할 해시맵
    HashMap<String, Integer> playerMap = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      playerMap.put(players[i], i);
    }

    // callings 순회하며 등수 업데이트
    for (String calling : callings) {
      int currentIndex = playerMap.get(calling);
      if (currentIndex > 0) {
        // 기존 앞에 있는 선수  = 현재 위치
        String frontPlayer = players[currentIndex - 1];
        // 추월한 위치 = 해설진이 부른 선수
        players[currentIndex - 1] = calling;
        // 밀린 위치 = 기존 앞에 있던 선수
        players[currentIndex] = frontPlayer;

        // map 업데이트
        playerMap.put(calling, currentIndex - 1);
        playerMap.put(frontPlayer, currentIndex);
      }
    }
    return players;
  }
}
