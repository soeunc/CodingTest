package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution87946 {
  public int solution(int k, int[][] dungeons) {
    List<int[][]> list = new ArrayList<>();
    permute(dungeons, 0, list);
    int max = 0;
    for (int[][] perm : list) {
      int fa = k;
      int count = 0;
      for (int[] dungeon : perm) {
        if (fa >= dungeon[0]) {
          fa -= dungeon[1];
          count++;
        } else {
          break;
        }
      }
      max = Math.max(max, count);
    }
    return max;
  }

  private void permute(int[][] dungeons, int start, List<int[][]> list) {
    if (start == dungeons.length) {
      int[][] copy = new int[dungeons.length][2];
      for (int i = 0; i < dungeons.length; i++) {
        copy[i][0] = dungeons[i][0];
        copy[i][1] = dungeons[i][1];
      }
      list.add(copy);
      return;
    }
    for (int i = start; i < dungeons.length; i++) {
      swap(dungeons, i, start);
      permute(dungeons, start + 1, list);
      swap(dungeons, i, start);
    }
  }

  private void swap(int[][] dungeons, int i, int j) {
    int[] temp = dungeons[i];
    dungeons[i] = dungeons[j];
    dungeons[j] = temp;
  }

  private int max = 0;
  public int solutionDfs(int k, int[][] dungeons) {
    boolean[] visited = new boolean[dungeons.length];
    dfs(k, dungeons, visited, 0);
    return max;
  }

  private void dfs(int fatigue, int[][] dungeons, boolean[] visited, int count) {
    max = Math.max(max, count);

    for (int i = 0; i < dungeons.length; i++) {
      if (!visited[i] && fatigue >= dungeons[i][0]) {
        visited[i] = true;
        dfs(fatigue - dungeons[i][1], dungeons, visited, count + 1);
        visited[i] = false;
      }
    }
  }
}
