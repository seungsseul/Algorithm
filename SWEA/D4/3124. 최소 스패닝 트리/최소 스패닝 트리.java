import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution {
	
	static int[] p; //대표를 저장할 배열
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken()); //정점의 수
			int E = Integer.parseInt(st.nextToken()); //간선의 수
			
			long[][] arr = new long[E][3];
			
			for(int i=0;i<E;i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken())-1; //시작정점
				int B = Integer.parseInt(st.nextToken())-1; //끝정점
				long C = Integer.parseInt(st.nextToken()); //간선가중치
				
				arr[i][0]=A;
				arr[i][1]=B;
				arr[i][2]=C;
			}
			
			Arrays.sort(arr, new Comparator<long[]>() {

				@Override
				public int compare(long[] o1, long[] o2) {
					return  (int) (o1[2]-o2[2]);
				}
				
			});
			
			//대표값 넣는 배열
			p = new int[V];
			
			//대표값 세팅
			for(int i=0;i<V;i++) {
				p[i]=i;
			}
			
			//최소값
			long min=0;
			//현재 픽한 간선의 개수
			int pick=0;
			
			for(int i=0;i<E;i++) {
				//간선의 개수만큼 for문돌아서 각 정점의 대표값을 찾아(findset) 비교하고, 서로 다르면 병합한다.(union)
				int px = findSet((int) arr[i][0]);
				int py = findSet((int) arr[i][1]);
				if(px != py) {
					union(px, py); //합치고
					min+=arr[i][2];
					pick++; //픽한 간선 개수 증가
				}
				//픽한 간선 개수가 n-1일때 끝내기
				if(pick==V-1) {
					break;
				}
			}
			System.out.println("#"+t+" "+min);		
			
		}
	}


	private static int findSet(int x) {
		if(x!=p[x]) {
			p[x]=findSet(p[x]);
		}
		return p[x];
	}
	
	
	private static void union(int x, int y) {
		p[findSet(y)]=findSet(x);
	}
}
