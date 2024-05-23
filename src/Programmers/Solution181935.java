package Programmers;

// 12.19
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class Solution181935 {
    public int solution(int n) {
        int num = 0;
        int[] dp = new int[n+1];
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                num += i;
            }
            return num;
        }
        else {
            for (int i = 2; i <= n; i+=2) {
                num += i * i;
            }
        }
        return num;
    }
}
