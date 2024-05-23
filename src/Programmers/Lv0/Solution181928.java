package Programmers.Lv0;
// 12.28
// https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class Solution181928 {
    public int solution(int[] num_list) {
        String answer = "";
        String add = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                answer += num_list[i];
            }
            else if (num_list[i] % 2 == 0) {
                add += num_list[i];
            }
        }
        return Integer.parseInt(answer) + Integer.parseInt(add);
    }
}
