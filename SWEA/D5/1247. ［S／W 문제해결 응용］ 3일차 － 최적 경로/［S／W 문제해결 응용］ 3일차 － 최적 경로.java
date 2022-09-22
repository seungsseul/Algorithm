import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static int[][] arr;
	static int N;
	static int[][] choice;
	static boolean[] visited;
	static int comr, comc, homer, homec;
	static List<Integer> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			N = sc.nextInt();
			arr = new int[N][2];
			//회사좌표
			comr=sc.nextInt();
			comc=sc.nextInt();
			//집좌표
			homer=sc.nextInt();
			homec=sc.nextInt();
			//고객좌표
			for(int i=0;i<N;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			visited = new boolean[N];
			choice=new int[N][2];
			list = new ArrayList<Integer>();
			perm(0);
			int min = Integer.MAX_VALUE;

			for(int i=0;i<list.size();i++) {
				if(min>list.get(i)) {
					min=list.get(i);
				}
			}
			System.out.println("#"+t+" "+min);
		}
		sc.close();
	}

	static void perm(int idx) {
		if(idx==N) {
			int distance=Math.abs(comr-choice[0][0])+Math.abs(comc-choice[0][1]);
			for(int i=1;i<N;i++) {
				distance+= (Math.abs(choice[i-1][0]-choice[i][0])+Math.abs(choice[i-1][1]-choice[i][1]));
			}
			distance+=(Math.abs(choice[N-1][0]-homer)+Math.abs(choice[N-1][1]-homec));
			list.add(distance);
			return;
		}
		
		for(int i=0;i<N;i++) {		
			if(visited[i]) {
				continue;
			}
			choice[idx][0]=arr[i][0];
			choice[idx][1]=arr[i][1];
			visited[i]=true;
			perm(idx+1);
			visited[i]=false;
		}
	}
}
