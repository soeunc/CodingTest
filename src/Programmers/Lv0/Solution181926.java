package Programmers.Lv0;

import java.util.List;

/*
"w" : n이 1 커집니다.
"s" : n이 1 작아집니다.
"d" : n이 10 커집니다.
"a" : n이 10 작아집니다.
 */
public class Solution181926 {
    public int solution(int n, String control) {
        // 문자열을 하나씩 돌려준다. 문자열의 한글자를 스위치로 숫자로 넣어주면 그 숫자를 answer에 넣는다.
        for (int i = 0; i < control.length(); i++)
            switch (control.charAt(i)) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n += -1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n += -10;
                    break;
            }
        return n;
    }
}
