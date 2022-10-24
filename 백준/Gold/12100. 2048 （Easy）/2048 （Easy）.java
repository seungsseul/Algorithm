import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] arr, copy_arr;
	static int N, cnt, max, ans;
	static final int INF = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		copy_arr = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		ans = Integer.MIN_VALUE;
		dfs(arr, 0, 0);
		if(ans==INF) {
			ans=0;
		}
		System.out.println(ans);
	}
	
	static void dfs(int[][] arr, int max, int cnt) {
		if(cnt==5) {
			if(max > ans) {
				ans = max;
			}
			return;
		}
		//왼쪽
		int tmp=Integer.MIN_VALUE;
		copy_arr = new int[N][N];
		for(int i=0;i<N;i++) {
			int move = 0;
			int tmp2=Integer.MIN_VALUE;
			for(int j=0;j<N;j++) {
				if(arr[i][j]!=0) {
					if(tmp2==arr[i][j]) {
						copy_arr[i][move-1]=arr[i][j]*2;
						tmp2=Integer.MIN_VALUE;
						if(arr[i][j]*2>tmp) {
							tmp=arr[i][j]*2;
						}
						
					}
					else {
						copy_arr[i][move]=arr[i][j];
						tmp2=arr[i][j];
						move++;
						if(arr[i][j]>tmp) {
							tmp=arr[i][j];
						}
					}
				}
			}
		}
		
		dfs(copy_arr, tmp, cnt+1);
		
		//오른쪽
		tmp=Integer.MIN_VALUE;
		copy_arr = new int[N][N];
		for(int i=0;i<N;i++) {
			int move = N-1;
			int tmp2=Integer.MIN_VALUE;
			for(int j=N-1;j>=0;j--) {
				if(arr[i][j]!=0) {
					if(tmp2==arr[i][j]) {
						copy_arr[i][move+1]=arr[i][j]*2;
						tmp2=Integer.MIN_VALUE;
						if(arr[i][j]*2>tmp) {
							tmp=arr[i][j]*2;
						}
						
					}
					else {
						copy_arr[i][move]=arr[i][j];
						tmp2=arr[i][j];
						move--;
						if(arr[i][j]>tmp) {
							tmp=arr[i][j];
						}
					}
				}
			}
		}
		
		dfs(copy_arr, tmp, cnt+1);
		
		//위
		tmp=Integer.MIN_VALUE;
		copy_arr = new int[N][N];
		for(int i=0;i<N;i++) {
			int move = 0;
			int tmp2=Integer.MIN_VALUE;
			for(int j=0;j<N;j++) {
				if(arr[j][i]!=0) {
					if(tmp2==arr[j][i]) {
						copy_arr[move-1][i]=arr[j][i]*2;
						tmp2=Integer.MIN_VALUE;
						if(arr[j][i]*2>tmp) {
							tmp=arr[j][i]*2;
						}
						
					}
					else {
						copy_arr[move][i]=arr[j][i];
						tmp2=arr[j][i];
						move++;
						if(arr[j][i]>tmp) {
							tmp=arr[j][i];
						}
					}
				}
			}
		}
		
		dfs(copy_arr, tmp, cnt+1);
		
		//아래
		tmp=Integer.MIN_VALUE;
		copy_arr = new int[N][N];
		for(int i=0;i<N;i++) {
			int move = N-1;
			int tmp2=Integer.MIN_VALUE;
			for(int j=N-1;j>=0;j--) {
				if(arr[j][i]!=0) {
					if(tmp2==arr[j][i]) {
						copy_arr[move+1][i]=arr[j][i]*2;
						tmp2=Integer.MIN_VALUE;
						if(arr[j][i]*2>tmp) {
							tmp=arr[j][i]*2;
						}
						
					}
					else {
						copy_arr[move][i]=arr[j][i];
						tmp2=arr[j][i];
						move--;
						if(arr[j][i]>tmp) {
							tmp=arr[j][i];
						}
					}
				}
			}
		}
		
		dfs(copy_arr, tmp, cnt+1);
	}
}
