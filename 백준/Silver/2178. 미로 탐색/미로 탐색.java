import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int ans;
    static class Node{
        int r, c, cnt;
        Node(int r, int c, int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N+2][M+2];
        visited =  new boolean[N+2][M+2];
        for(int i = 1; i <= N; i++) {
            String line = sc.next();
            for(int j = 1; j <= M; j++)
                map[i][j] = line.charAt(j-1) - '0';
        }
        //큐를 준비한다.
        Queue<Node> queue = new LinkedList<>();
        //시작상태를 큐에 넣고 방문체크를 한다.
        queue.add(new Node(1,1,1));
        visited[1][1] = true;
        //큐가 빌때까지
        while( ! queue.isEmpty() ) {
            //    꺼내서 정답이 나오면 스탑
            Node n = queue.poll();
            if(n.r == N && n.c == M) {
                System.out.println(n.cnt);
                break;
            }
            //    다음 상태에 대해 큐에 넣고 방문체크를 한다.
            for(int d = 0; d < 4; d++) {
                int nr = n.r + dr[d];
                int nc = n.c + dc[d];
                if( map[nr][nc] == 0 )
                    continue;
                if( visited[nr][nc] )
                    continue;
                queue.add(new Node(nr, nc, n.cnt + 1));
                visited[nr][nc] = true;
            }
        }
    }
}