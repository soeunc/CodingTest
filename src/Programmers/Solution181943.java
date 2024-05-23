package Programmers;
// 12.13
// https://school.programmers.co.kr/learn/courses/30/lessons/181943

public class Solution181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}
