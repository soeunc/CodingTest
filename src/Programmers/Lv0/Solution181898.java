package Programmers.Lv0;

public class Solution181898 {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length ; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
