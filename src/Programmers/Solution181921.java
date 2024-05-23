package Programmers;


import java.util.ArrayList;

public class Solution181921 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = l; i <= r; i++) {
            String str = i + "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 48 || str.charAt(j) == 53) {
                    count++;
                }
            }
            if (count == str.length()) {
                list.add(i);
            }
            count = 0;
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        int[] empty = {-1};
        if (answer.length == 0) {
            return empty;
        }
        return answer;
    }
}
