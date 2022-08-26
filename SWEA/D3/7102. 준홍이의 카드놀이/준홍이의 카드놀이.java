import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int x=1;x<=T;x++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] N_arr = new int[N];
			int[] M_arr = new int[M];
			for(int i=0;i<N;i++) {
				N_arr[i]=i+1;
			}
			for(int i=0;i<M;i++) {
				M_arr[i]=i+1;
			}
			int[] idx_arr = new int[N+M+1];
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					idx_arr[N_arr[i]+M_arr[j]]++;
				}
			}
			int max=0;
			List<Integer> list = new ArrayList<>();
			list.add(max);
			for(int i=1;i<idx_arr.length;i++) {
				if(max<=idx_arr[i]) {
					if(max<idx_arr[i]) {
						list.clear();
						max=idx_arr[i];
						list.add(i);
					}
					else if(max==idx_arr[i]) {
						max=idx_arr[i];
						list.add(i);
					}
				}
				
			}
			Collections.sort(list);
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(x).append(" ");
			for(int i=0;i<list.size();i++) {
				sb.append(list.get(i));
				if(i!=list.size()-1) {
					sb.append(" ");
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}
}