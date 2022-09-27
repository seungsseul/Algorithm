import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
	static class Node{
        int r, c, cnt, crush;
        Node(int r, int c,  int cnt, int crush ){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
            this.crush = crush;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		int[][] visited = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String Input = sc.next();
			for(int j=0;j<M;j++) {
				arr[i][j] = Character.getNumericValue(Input.charAt(j));
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		
		int ans = Integer.MAX_VALUE;
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(0,0,1,0));
		visited[0][0]=0;
		while(!queue.isEmpty()) {
			Node n = queue.poll();
			
			if(n.r==N-1 && n.c==M-1) {
				ans = n.cnt;
				break;
			}
			for(int d = 0; d < 4; d++) {
				int nr = n.r + dr[d];
				int nc = n.c + dc[d];
				if(nr<0 || nc<0 || nr>=N || nc>=M) {
					continue;
				}
				if(visited[nr][nc]<=n.crush) {
					continue;
				}
				//벽이 아닐때
				if(arr[nr][nc]==0) {
					visited[nr][nc]=n.crush;
					queue.add(new Node(nr, nc, n.cnt+1, n.crush));
				}
				else {
					if(n.crush==0) {
						visited[nr][nc]=n.crush+1;
						queue.add(new Node(nr, nc, n.cnt+1, n.crush+1));
					}
				}
			}				
		}
		if(ans==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
		sc.close();
	}
}
