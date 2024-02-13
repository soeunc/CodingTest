package Programmers.Lv0;

public class Solution181902 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isUpperCase(ch)) {
                answer[ch - 'A']++;
            } else if (Character.isLowerCase(ch)) {
                // 대문자 다음으로 알파벳에 해당하는 배열 위치에 개수를 누적
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}
