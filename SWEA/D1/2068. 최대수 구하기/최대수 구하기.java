import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=1; i<=T; i++) {
			int[] newInt = new int[10];
			for (int j = 0; j < 10; j++) {
	            int x = sc.nextInt();
	            newInt[j] = x;
	        }
			int max = newInt[0];
			for (int num : newInt) {
				if (num>max) {
					max = num;
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}
}