package BJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prob2606 {
    public static int[][] maps;
    public static boolean[] visited;
    public static int M, N; // 간선, 정점
    public static int count = 0;

    // maps[i][j] == 1 이면 연결되어있다.
    public static int bfs(int start) {
        Queue<Integer> toVisit = new LinkedList<>();
        // 방문했다는 표시
        visited[start] = true;
        // 시작 노드 큐에 추가
        toVisit.offer(start);

        while (!toVisit.isEmpty()) {
            // 현재 위치를 꺼낸다.
            int now = toVisit.poll();
            // 간선의 갯수 만큼 반복
            for (int i = 1; i <= M; i++) {
                if (
                        // 간선이 존재한다.
                        maps[now][i] == 1 &&
                        // 방문한 적이 없다.
                        !visited[i]
                ) {
                    // 방문했다고 큐에 표시
                    toVisit.offer(i);
                    // 방문했다는데 맞다고 표시
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();

        maps = new int[M + 1][M + 1];
        visited = new boolean[M + 1];

        for (int i = 0; i < N; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            maps[n][m] = maps[m][n] = 1;
        }
        System.out.println(bfs(1));
    }


    // dfs풀기
    /*public static void dfs(int x){
        visited[x] = true;
        result += 1;

        for(int i = 1; i<= M; i++){
            if(node[x][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();

        node = new int[M+1][M+1];
        visited = new boolean[M+1];

        for(int i=0; i<N; i++){
           int m = sc.nextInt();
           int n = sc.nextInt();
           node[m][n] = node[n][m] = 1;
        }

        dfs(1);
        System.out.println(result-1);

    }*/
}