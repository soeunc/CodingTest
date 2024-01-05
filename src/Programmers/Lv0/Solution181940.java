package Programmers.Lv0;
// 12.18
// https://school.programmers.co.kr/learn/courses/30/lessons/181940
public class Solution181940 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
