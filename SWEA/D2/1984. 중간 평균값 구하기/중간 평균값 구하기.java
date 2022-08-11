import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int[] arr = new int[10];
			for(int j=0;j<10;j++) {
				arr[j] = sc.nextInt();
			}
			//1.가장 큰 값 알아내기
			int max=-1;
			for(int j=0;j<arr.length;j++) {
				if(max<arr[j]) {
					max = arr[j];
				}
			}
			//2.세기
			int[] cnt_arr = new int[max+1];
			for(int j=0;j<arr.length;j++) {
				cnt_arr[arr[j]]++;
			}
			//3.누적합 구하기
			for(int j=1;j<cnt_arr.length;j++) {
				cnt_arr[j]=cnt_arr[j-1]+cnt_arr[j];
			}
			//4.정렬해서 넣기
			int[] sort_arr = new int[arr.length];
			for(int j=arr.length-1;j>=0;j--) {
				cnt_arr[arr[j]]=cnt_arr[arr[j]]-1;
				sort_arr[cnt_arr[arr[j]]]=arr[j];
			}
			int sum=0;
			for(int j=1;j<sort_arr.length-1;j++) {
				sum+=sort_arr[j];
			}
			System.out.println("#"+i+" "+Math.round((float)sum/(arr.length-2)));
		}
		sc.close();
	}
}