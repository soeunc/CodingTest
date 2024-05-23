package Programmers;

// 12.25
// https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class Solution181929 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        if (mul < sum * sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
