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
	static int cnt, ans;
	static int[][] map;
	static boolean[][] visited;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		map = new int[5][5];
		visited = new boolean[5][5];
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
		}
		ans = 0;
		while(!q.isEmpty()) {
			ans++;
			searchMap(q.poll());
			if(checkMap()) {
				break;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();bw.close();br.close();
	}
	static void searchMap(int poll) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(poll==map[i][j]) {
					visited[i][j]=true;
					return;
				}
			}
		}
	}
	static boolean checkMap() {
		cnt = 0;
		loop:
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(!visited[i][j]) {
					continue loop;
				}
			}
			cnt++;
		}
		loop:
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				if(!visited[i][j]) {
					continue loop;
				}
			}
			cnt++;
		}
		for(int i=0;i<5;i++) {
			if(!visited[i][i]) {
				break;
			}
			if(i==4) {				
				cnt++;
			}
		}
		for(int i=0;i<5;i++) {
			if(!visited[i][Math.abs(i-4)]) {
				break;
			}
			if(i==4) {				
				cnt++;
			}
		}
		if(cnt>=3) {
			return true;
		}
		return false;
	}
}
