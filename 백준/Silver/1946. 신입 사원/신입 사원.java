import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int T, N, min, ans;
	static List<Node> list;
	static class Node implements Comparable<Node>{
		int paper;
		int grade;
		public Node(int paper, int grade) {
			this.paper = paper;
			this.grade = grade;
		}
		
		@Override
		public int compareTo(Node o) {
			
			if(this.paper>o.paper) {
				return 1;
			}
			else {
				return -1;
			}
			
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			N = Integer.parseInt(br.readLine());
			list = new ArrayList<>();
			for(int i=0;i<N;i++) {				
				st = new StringTokenizer(br.readLine());
				int p=Integer.parseInt(st.nextToken());
				int g=Integer.parseInt(st.nextToken());
				list.add(new Node(p, g));
			}
			Collections.sort(list);
			ans=0;
			min = list.get(0).grade;
			for(int i=0;i<N;i++) {
				if(list.get(i).grade < min) {
					min = list.get(i).grade;
					ans++;
				}
			}
			sb.append(ans+1).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
