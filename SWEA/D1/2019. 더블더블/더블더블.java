import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T+1];
		for(int i=0;i<=T;i++) {
			arr[i] = (int) Math.pow(2,i);
			System.out.print(arr[i]+" ");
		}
	}
}