import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static int N;
	static int R;
	static int[][] table;
	static int[] foodr;
	static List<Integer> list; 
	static int sum;
	static int sum2;
	static int[] sell;
	static int[] sel;
	static int[] sel2;
	static int[] unsel2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			N = sc.nextInt();
			table = new int[N][N];
			foodr = new int[N];
			for(int i=0;i<N;i++) {
				foodr[i]=i;
				for(int j=0;j<N;j++) {
					table[i][j]=sc.nextInt();
				}
			}
			R=N/2;
			sel2 = new int[R];
			unsel2 = new int[R];
			sel = new int[2];
			sell = new int[2];
			list = new ArrayList<Integer>();
			combination(0,0);
			//리스트를 돌면서 맛의차이 최솟값 출력
			int min = Integer.MAX_VALUE;
			for(int i=0;i<list.size();i++) {
				if(min>list.get(i)) {
					min=list.get(i);
				}
			}
			System.out.println("#"+t+" "+min);
		}
	}
	
	//식재료시너지1(1+2)+식재료시너지2(2+1)=A음식의 맛
	//식재료시너지3(3+4)+식재료시너지4(4+3)=B음식의 맛
	//두 음식간의 맛의 차이1 = Math.abs(A-B)
	
	//식재료시너지1(1+3)+식재료시너지2(3+1)=A음식의 맛
	//식재료시너지3(2+4)+식재료시너지4(4+2)=B음식의 맛
	//두 음식간의 맛의 차이2 = Math.abs(A-B)
	
	//맛의 차이가 최소인 경우 = Math.min(두 음식간의 맛의 차이1, 두 음식간의 맛의 차이2)
	
	static void combination(int idx, int sidx) {

		if(sidx == R) {
			int idxunsel=0;
			//선택된 재료인덱스 배열(sel2)를 통해 선택되지 않은 재료인덱스 배열(unsel2) 값 부여하기
			for(int i=0;i<foodr.length;i++) {
				for(int j=0;j<sel2.length;j++) {
					if(foodr[i]==sel2[j]) {
						break;
					}
					if(j==sel2.length-1 && foodr[i]!=sel2[j]) {
						unsel2[idxunsel]=foodr[i];
						idxunsel++;
					}
				}
			}
			sum=0;sum2=0;
			//해당 배열의 인덱스(=재료)가지고 음식의 맛 각각 출력하기
			combi(sel,0,0);
			combi2(sell,0,0);
			//두 음식간 맛의 차이 구하고 리스트에 담기
			int taste = Math.abs(sum2-sum);
			list.add(taste);
			return;
		}
		
		else if(idx == N) return;
		
		sel2[sidx]=foodr[idx];
		combination(idx+1, sidx+1);
		combination(idx+1, sidx);

	}
	
	//선택된 재료시너지들의 합 = 음식A
	static void combi(int[] sel, int curr, int cnt) {
		
		if(cnt == 2) {
			sum+=table[sel[0]][sel[1]];
			return;
		}

		for(int i=curr;i<R;i++) {
			sel[cnt]=sel2[i]; 
			combi(sel, curr, cnt+1);

		}

	}
	
	//선택되지 않은 재료시너지들의 합 = 음식B
	static void combi2(int[] sell, int curr, int cnt) {

		if(cnt == 2) {
			sum2+=table[sell[0]][sell[1]];
			return;
		}
		
		for(int i=curr;i<R;i++) {
			sell[cnt]=unsel2[i]; 
			combi2(sell, curr, cnt+1);
		}
	}	
}