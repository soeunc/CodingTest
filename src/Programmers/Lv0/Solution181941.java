package Programmers.Lv0;
// 12.18
// https://school.programmers.co.kr/learn/courses/30/lessons/181941
public class Solution181941 {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i].toString();
        }
        return answer;
    }
}
