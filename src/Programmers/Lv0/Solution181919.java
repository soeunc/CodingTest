package Programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution181919 {
    public int[] solution(int n) {
        List<Integer> array = new ArrayList<>();
        array.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            array.add(n);
        }

        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}
