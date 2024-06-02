package Programmers;

public class Solution172928 {
  public int[] solution(String[] park, String[] routes) {
   // 가로, 세로 길이 구하기
    int W = park[0].length();
    int H = park.length;
    int startX = -1, startY = -1;

    // 초기 위치 설정, S의 위치를 저장하기
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (park[i].charAt(j) == 'S') {
          startX = i;
          startY = j;
          break;
        }
      }
      if (startX != -1) break;
    }
    // 델타배열 방향 정의
    int[][] deltaDirection = {
            {'E', 0, 1},
            {'W', 0, -1},
            {'N', -1, 0},
            {'S', 1, 0}

    };

    int x = startX;
    int y = startY;
    // routes의 방향, 거리 분리 후 델타 값 찾기
    for (String route : routes) {
      String[] parts = route.split(" ");
      char direction = parts[0].charAt(0);
      int distance = Integer.parseInt(parts[1]);
      int deltaX = 0, deltaY = 0;
      for (int[] dir : deltaDirection) {
        if (dir[0] == direction) {
          deltaX = dir[1];
          deltaY = dir[2];
          break;
        }
      }
      int newX = x, newY = y;
      boolean validMove = true;
      // 새로운 위치 계산, 그 위치 장애물 확인
      for (int i = 1; i <= distance ; i++) {
        newX = x + deltaX * i;
        newY = y + deltaY * i;
        if (newX < 0 || newX >= H || newY < 0 || newY >= W || park[newX].charAt(newY) == 'X') {
          validMove = false;
          break;
        }
      }

      if (validMove) {
        x = newX;
        y = newY;
      }
    }
    return new int[]{x, y};
  }
}
