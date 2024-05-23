package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution181920 {
    /*public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }
        return answer;
    }*/

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }

}
