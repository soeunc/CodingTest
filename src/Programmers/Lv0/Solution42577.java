package Programmers.Lv0;

import java.util.Arrays;

public class Solution42577 {
  public boolean solution(String[] phone_book) {
    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i++) {
      String str = phone_book[i];
      if (phone_book[i + 1].startsWith(str)) {
        return false;
      }
    }
    return true;
  }

}
