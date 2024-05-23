package Programmers;

import java.util.Arrays;

public class Solution181916 {
    /*public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return 1111 * a;
        } else if (a == b && b == c) {
            return ((10 * a + d) * (10 * a + d));
        } else if (a == c && c == d) {
            return ((10 * a + b) * (10 * a + b));
        } else if (a == b && b == d) {
            return ((10 * a + c) * (10 * a + c));
        } else if (b == c && c == d) {
            return ((10 * b + a) * (10 * b + a));
        } else if (a == b && c == d) {
            return ((a + c) * (Math.abs(a - c)));
        } else if (a == c && b == d) {
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == d && b == c) {
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == b && c != d) {
            return (c * d);
        } else if (a == c && b != d) {
            return (b * d);
        } else if (a == d && b != c) {
            return (b * c);
        } else if (b == c && a != d) {
            return (a * d);
        } else if (b == d && a != c) {
            return (a * c);
        } else if (c == d && a != b) {
            return (a * b);
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }*/

    // 정렬로 풀어보기
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        int answer = 0;

        if (dice[0] == dice[3]) {
            answer = 1111 * dice[0];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }

        return answer;
    }
}
