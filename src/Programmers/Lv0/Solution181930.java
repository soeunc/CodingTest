package Programmers.Lv0;
// 12.25
// https://school.programmers.co.kr/learn/courses/30/lessons/181930
public class Solution181930 {
    public int solution(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return a + b + c;
        } else if (a == b &&  a == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        else {
            return (a + b + c) * (a * a + b * b + c * c);
        }
    }

    // 강사님 방법
    /*
    public int solution(int a, int b, int c) {
        // 정렬을 하기위해 배열로 나열한다.
        int[] numbers = {a, b, c};
        // 정렬을 한다.
        Arrays.sort(numbers);

        // 1. 0번 원소와 2번 원소가 동일하면 3개 일치
        if (numbers[0] == numbers[2]) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        // 2. (1번이 아니라면) 0번 원소와 1번 원소가 같거나(||) 1번 원소와 2번 원소가 같거나
        else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            return (a + b + c) * (a * a + b * b + c * c);
        }
        // 3. 아니면 다 다르다.
        else {
            return (a + b + c);
        }
    }
     */
}
