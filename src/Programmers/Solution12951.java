package Programmers;

public class Solution12951 {
  public String solution(String s) {
    String[] words = s.split(" ", -1);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (!word.isEmpty()) {
        char first = word.charAt(0);
        if (Character.isLetter(first)) {
          sb.append(Character.toUpperCase(first));
          sb.append(word.substring(1).toLowerCase());
        } else {
          sb.append(first);
          sb.append(word.substring(1).toLowerCase());
        }
      }
      if (i < words.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }
}
