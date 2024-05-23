package Programmers;

public class Solution181913 {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char result = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = result;

                start++;
                end--;
            }
        }

        return new String(charArray);
    }
}
