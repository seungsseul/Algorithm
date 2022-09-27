import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	static int K,W,H,ans;
	static int[][] arr;
	static boolean[][][] visited;
	static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[] dr2 = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dc2 = {-2, -1, 1, 2, 2, 1, -1, -2};
	static class Node{
        int r, c, cnt, jump;
        Node(int r, int c,  int cnt, int jump ){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
            this.jump = jump;
        }
      
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		W = sc.nextInt();
		H = sc.nextInt();
		
		arr = new int[H][W];
		visited = new boolean[H][W][K+1];
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		ans = Integer.MAX_VALUE;
		bfs(0,0,K);
		if(ans==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
		sc.close();
	}
	
	static void bfs(int r,int c, int k) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(r,c,0,0));
		visited[r][c][0]=true;
		while(!queue.isEmpty()) {
			Node n = queue.poll();
			if(n.r==H-1 && n.c==W-1) {
				ans = n.cnt;
				return;
			}
			for(int d = 0; d < 4; d++) {
				int nr = n.r + dr[d];
				int nc = n.c + dc[d];
				if(nr<0 || nc<0 || nr>=H || nc>=W) {
					continue;
				}

				if(visited[nr][nc][n.jump]) {
					continue;
				}


				if(arr[nr][nc]==0) {					
					visited[nr][nc][n.jump]=true;
					queue.add(new Node(nr, nc, n.cnt+1, n.jump));
				}
			}
				
				

			if(n.jump<k) {

				for(int d = 0; d < 8; d++) {
					int nr = n.r + dr2[d];
					int nc = n.c + dc2[d];
					if(nr<0 || nc<0 || nr>=H || nc>=W) {
						continue;
					}

					if(visited[nr][nc][n.jump+1]) {
						continue;
					}

					if(arr[nr][nc]==0) {					
						visited[nr][nc][n.jump+1]=true;
						queue.add(new Node(nr, nc, n.cnt+1, n.jump+1));
					}
				}
					
			}
		}
	}
}
