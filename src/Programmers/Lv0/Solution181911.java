package Programmers.Lv0;


public class Solution181911 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            String str = my_strings[i];

            answer += str.substring(parts[i][0], parts[i][1]+1);
        }

        return answer;
    }
}
