package Programmers;

import java.util.Arrays;

public class Solution181900 {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder result = new StringBuilder(my_string);

        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            if (index < my_string.length()) {
                result.deleteCharAt(index);
            }
        }
        return result.toString();
    }
}
