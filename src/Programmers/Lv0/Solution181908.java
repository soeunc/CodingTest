package Programmers.Lv0;

import java.util.Arrays;

public class Solution181908 {
    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;
        }
        return 0;
    }
}
