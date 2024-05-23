package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution181901 {
    public int[] solution(int n, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0)
                result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
