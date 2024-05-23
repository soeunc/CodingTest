package Programmers;

public class Solution181924 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < queries.length; i++) {
            int a = arr[queries[i][0]];  // arr[i] 값 초기화
            arr[queries[i][0]] = arr[queries[i][1]]; // arr[i] = arr[j] 대입 하여 순서 바꾼 뒤 반복 하여 나오게한다.
            arr[queries[i][1]] = a;
            answer = arr;
        }
        return answer;
    }
}
