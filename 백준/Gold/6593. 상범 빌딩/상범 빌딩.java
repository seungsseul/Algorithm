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
	static StringBuilder sb = new StringBuilder();
	static int L, R, C, ans;
	static String Input;
	static String[][][] arr;
	static boolean[][][] visited;
	static boolean flag;
	static Queue<Person> q;
	static int dh[] = {0,0,0,0,-1,1};
	static int dr[] = {0,0,-1,1,0,0};
	static int dc[] = {-1,1,0,0,0,0};
	static class Person {
		int h;
		int r;
		int c;
		int cnt;
		public Person(int h, int r, int c, int cnt) {
			super();
			this.h = h;
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
		
	}
	public static void main(String[] args) throws IOException {
		while(true) {			
			st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if(L==0 && R==0 && C==0) {
				break;
			}
			arr = new String[L][R][C];
			visited = new boolean[L][R][C];
			q = new LinkedList<>();
			flag=false;
			for(int t=0;t<L;t++) {
				for(int i=0;i<R;i++) {
					Input = br.readLine();
					for(int j=0;j<C;j++) {
						arr[t][i][j]=String.valueOf(Input.charAt(j));
						if(arr[t][i][j].equals("S")) {
							q.add(new Person(t,i,j,0));
						}
					}
				}
				br.readLine();
			}
			loop:
			while(!q.isEmpty()) {
				Person p = q.poll();
				for(int d=0;d<6;d++) {
					int nh = p.h+dh[d];
					int nr = p.r+dr[d];
					int nc = p.c+dc[d];
					if(nh>=0 && nr>=0 && nc>=0 && nh<L && nr<R && nc<C) {
						if(arr[nh][nr][nc].equals(".") && !visited[nh][nr][nc]) {
							visited[nh][nr][nc]=true;
							q.add(new Person(nh,nr,nc,p.cnt+1));
						}
						else if(arr[nh][nr][nc].equals("E")) {
							flag=true;
							p.cnt++;
							ans=p.cnt;
							break loop;
						}
					}
				}
			}
			if(!flag) {
				sb.append("Trapped!").append("\n");
			}
			else {
				sb.append("Escaped in ").append(ans).append(" minute(s).").append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}
