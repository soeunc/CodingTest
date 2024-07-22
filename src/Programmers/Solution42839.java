package Programmers;

import java.util.HashSet;

public class Solution42839 {
  public int solution(String numbers) {
    // 중복 제거를 위해 hashset에 저장
    HashSet<Integer> set = new HashSet<>();
    newNumbers("", numbers, set);

    int count = 0;
    for (int n : set) {
      if (isPrime(n)) {
        count++;
      }
    }
    return count;
  }

  // 모든 숫자 조합 만들기
  private static void newNumbers(String current, String remaining, HashSet<Integer> set) {
    if (!current.isEmpty()) {
      set.add(Integer.valueOf(current));
    }
    for (int i = 0; i < remaining.length(); i++) {
      newNumbers(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), set);
    }
  }
  // 소수인지 확인
  private static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
