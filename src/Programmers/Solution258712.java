package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution258712 {
  public int solution(String[] friends, String[] gifts) {
    Map<String, Integer> map = new HashMap<>();
    // 키: 친구 이름, 값: 친구 인덱스
    for (int i = 0; i < friends.length; i++) {
      map.put(friends[i], i);
    }
    // 선물 지수
    int[] index = new int[friends.length];
    // 선물 주고받은 기록
    int[][] record = new int[friends.length][friends.length];

    // 선물 주고받은 기록 확인
    for (String str : gifts) {
      String[] cur = str.split(" ");
      index[map.get(cur[0])]++;
      index[map.get(cur[1])]--;
      record[map.get(cur[0])][map.get(cur[1])]++;
    }

    // 담달에 받을 선물 계산
    int ans = 0;
    for (int i = 0; i < friends.length; i++) {
      int cnt = 0;
      for (int j = 0; j < friends.length; j++) {
        if(i == j) continue;
        if (record[i][j] > record[j][i]) cnt++;
        else if (record[i][j] == record[j][i] && index[i] > index[j]) cnt++;
      }
      ans = Math.max(cnt, ans);
    }
    return ans;
  }

  // TODO map으로 풀어보기
  public int solutionX(String[] friends, String[] gifts) {
    // 준 선물
    HashMap<String, Integer> givenGifts = new HashMap<>();
    // 받은 선물
    HashMap<String, Integer> receivedGifts = new HashMap<>();


    for (String friend : friends) {
      givenGifts.put(friend, 0);
      receivedGifts.put(friend, 0);
    }

    for (String gift : gifts) {
      String[] pars = gift.split(" ");
      String giver = pars[0];
      String receiver = pars[1];
      givenGifts.put(giver, givenGifts.get(giver) + 1);
      receivedGifts.put(receiver, receivedGifts.get(receiver) + 1);
    }

    // 선물 지수
    HashMap<String, Integer> giftIndex = new HashMap<>();
    for (String friend : friends) {
      giftIndex.put(friend, givenGifts.getOrDefault(friend, 0) - receivedGifts.getOrDefault(friend, 0));
    }

    HashMap<String, Integer> nextMonthGifts = new HashMap<>();
    for (String friend : friends) {
      int given = givenGifts.getOrDefault(friend, 0);
      int received = receivedGifts.getOrDefault(friend, 0);

      int count = 0;
      for (String otherFriend : friends) {
        if (!otherFriend.equals(friend)) {
          int otherGiven = givenGifts.getOrDefault(otherFriend, 0);
          int otherReceived = receivedGifts.getOrDefault(otherFriend, 0);
          if (given > otherReceived) {
            count++;
          } else if (given == otherReceived) {
            if (giftIndex.get(friend) > giftIndex.getOrDefault(otherFriend, 0)) {
              count++;
            }
          }
        }
      }
      nextMonthGifts.put(friend, count);
    }
    int maxGifts = 0;
    for (int count : nextMonthGifts.values()) {
      if (count > maxGifts) {
        maxGifts = count;
      }
    }

    return maxGifts;
  }
}
