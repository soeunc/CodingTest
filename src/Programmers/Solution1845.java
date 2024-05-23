package Programmers;

import java.util.HashSet;

public class Solution1845 {
  public int solution(int[] nums) {
    HashSet<Integer> result = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (!result.contains(nums[i]))
        result.add(nums[i]);
    }

    return Math.min(result.size(), nums.length / 2);
  }
}
