package Programmers.Lv0;

public class Solution181906 {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        }
        return 0;
    }

    /* public String solution(String my_string, int s, int e) {

        char[] arr = my_string.toCharArray();
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        return new String(arr);
    }*/
}
