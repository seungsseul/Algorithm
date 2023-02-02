import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M, Hx, Hy, Ex, Ey, ans;
	static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] arr, visited;
    static Queue<Node> queue;
	static class Node{
        int r, c, cnt, crush;
        Node(int r, int c,  int cnt, int crush ){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
            this.crush = crush;
        }
    }
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());	
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());	
		Hx = Integer.parseInt(st.nextToken())-1;
		Hy = Integer.parseInt(st.nextToken())-1;
		st = new StringTokenizer(br.readLine());	
		Ex = Integer.parseInt(st.nextToken())-1;
		Ey = Integer.parseInt(st.nextToken())-1;
		
		arr = new int[N][M];
		visited = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		
		ans = Integer.MAX_VALUE;
		queue = new LinkedList<>();
		queue.add(new Node(Hx,Hy,0,0));
		visited[Hx][Hy]=0;
		while(!queue.isEmpty()) {
			Node n = queue.poll();		
			if(n.r==Ex && n.c==Ey) {
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
			bw.write(String.valueOf(-1));
		}
		else {
			bw.write(String.valueOf(ans));
		}
		bw.flush();bw.close();br.close();
	}
}