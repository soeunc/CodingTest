package Programmers;
// 12.20
// https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class Solution181933 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }
}
