import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int tn = sc.nextInt();
			int[] cnt_arr = new int[101];
			for(int j=0;j<1000;j++) {
				int num = sc.nextInt();
				cnt_arr[num]++;
			}
			int max = 0;
			int idx = 0;
			for(int j=0;j<cnt_arr.length;j++) {
				if(max<=cnt_arr[j]) {
					max=cnt_arr[j];
					idx = j;
				}
			}
			System.out.println("#"+tn+" "+idx);
		}	
	}
}