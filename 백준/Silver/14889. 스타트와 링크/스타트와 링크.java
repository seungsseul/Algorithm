import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, startSum, linkSum, min;
	static int[][] board;
	static int[] arr, startArr, linkArr;
	static boolean[] visited, combiVisited;
	static List<Integer> start, link;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		arr = new int[N/2];
		visited = new boolean[N];
		min = Integer.MAX_VALUE;
		combination(0, 0);
		bw.write(String.valueOf(min));bw.flush();bw.close();br.close();
	}
	static void combination(int depth, int first) {
		if(depth==N/2) {
			start = new LinkedList<Integer>();
			link = new LinkedList<Integer>();
			for(int i=0;i<N;i++) {
				if(visited[i]) {
					start.add(i);
				}
				else {
					link.add(i);
				}
			}
			startArr = new int[2];
			linkArr = new int[2];
			combiVisited = new boolean[N/2];
			startSum = 0; linkSum = 0;
			combination2(0, 0);
			min = Math.min(Math.abs(startSum-linkSum),min);
			return;
		}
		for(int i=first;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				combination(depth+1, i+1);
				visited[i]=false;
			}
		}
	}
	static void combination2(int depth, int first) {
		if(depth==2) {
			startSum += (board[startArr[0]][startArr[1]]+board[startArr[1]][startArr[0]]);
			linkSum += (board[linkArr[0]][linkArr[1]]+board[linkArr[1]][linkArr[0]]);
			return;
		}
		for(int i=first;i<N/2;i++) {
			if(!combiVisited[i]) {
				combiVisited[i] = true;
				startArr[depth] = start.get(i);
				linkArr[depth] = link.get(i);
				combination2(depth+1,i+1);
				combiVisited[i] = false;
			}
		}
	}
}
