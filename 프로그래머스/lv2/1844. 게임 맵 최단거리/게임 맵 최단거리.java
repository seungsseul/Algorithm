import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Solution {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] visited;
    static Queue<Node> queue;
	static class Node{
        int r, c, cnt;
        Node(int r, int c,  int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
    public int solution(int[][] arr) {
	    //방문배열 생성
        visited = new boolean[arr.length][arr[0].length];
	    //방문횟수 초기값 도착했는지 여부 판별위해 MAXVALUE로 지정
		int ans=Integer.MAX_VALUE;
		queue = new LinkedList<>();
	    	//큐에다 시작좌표와 방문횟수 넣고
		queue.add(new Node(0,0,0));
	    	//처음위치 방문처리
		visited[0][0]=true;
	    	//더이상 갈곳이 없을때까지
		while(!queue.isEmpty()) {
			//큐에서 하나뽑아서
			Node n = queue.poll();
			//만약 해당 위치가 도착점이면 ans 방문횟수로 최신화해주고 break
			if(n.r==arr.length-1 && n.c==arr[0].length-1) {
				ans=n.cnt+1;
				break;
			}
			//4방탐색하여 갈곳이있는지 확인
			for(int d = 0; d < 4; d++) {
				int nr = n.r + dr[d];
				int nc = n.c + dc[d];
				if(nr<0 || nc<0 || nr>=arr.length || nc>=arr[0].length) {
					continue;
				}
				if(visited[nr][nc]) {
					continue;
				}
				//갈곳이 있으면 방문처리해주고 큐에 해당 좌표와 방문횟수추가해서 넣기
				if(arr[nr][nc]==1) {
					visited[nr][nc]=true;
					queue.add(new Node(nr, nc, n.cnt+1));
				}

			}				
		}
	    	//만약 도착점까지 방문하지 않았으면 -1로 값 세팅
		if(ans==Integer.MAX_VALUE) {
			ans=-1;
		}
		return ans;
    }
}
