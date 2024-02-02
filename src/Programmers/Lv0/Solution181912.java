package Programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class Solution181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            String substring = str.substring(s, s + l);
            int i = Integer.parseInt(substring);
            if (i > k) {
                result.add(i);
            }
        }
        // 정수로 변환하여 배열로 저장
        return result.stream().mapToInt(i->i).toArray();
    }
}
