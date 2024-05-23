package Programmers;


import java.util.ArrayList;

public class Solution181918 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size() - 1);
                }
            }
        }
        int[] result = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            result[i] = stk.get(i);
        }

        return result;
    }
}
