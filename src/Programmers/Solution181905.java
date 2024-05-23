package Programmers;

public class Solution181905 {
    public String solution(String my_string, int s, int e) {
        String substr = my_string.substring(s, e + 1);

        StringBuilder stringBuilder = new StringBuilder(substr);
        String reverse = stringBuilder.reverse().toString();

        my_string = my_string.replaceAll(substr, reverse);
        return my_string;

    }
}
