package Programmers;

public class Solution131705 {
  // 1.
  public int solution(int[] number) {
    int answer = 0;
    for (int i = 0; i < number.length - 2; i++) {
      for (int j = i +1; j < number.length - 1; j++) {
        for (int k = j + 1; k < number.length; k++) {
          if (number[i] + number[j] + number[k] == 0) {
            answer++;
          }
        }
      }
    }
    return answer;
  }

  // 2.
  public int solution1(int[] number) {
    return dfs(number, 0, 0, 0);
  }

  private int dfs(int[] number, int index, int count, int sum) {
    // 숫자 3개를 선택했을 때
    if (count == 3) {
      return sum == 0 ? 1 : 0;
    }

    // 배열 끝까지 탐색했을 때
    if (index == number.length) {
      return 0;
    }

    // 현재 숫자를 선택하는 경우
    int include = dfs(number, index + 1, count + 1, sum + number[index]);
    // 현재 숫자를 선택하지 않는 경우
    int exclude = dfs(number, index + 1, count, sum);

    // 두 경우의 합
    return include + exclude;
  }
}
