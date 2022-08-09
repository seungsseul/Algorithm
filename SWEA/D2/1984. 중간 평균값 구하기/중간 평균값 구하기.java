import java.util.Arrays;
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
			for(int k=0; k<arr.length-1;k++) {
				for(int j=0; j<arr.length-1;j++) {
					if(arr[j]>=arr[j+1]) {
						int temp = arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			int sum=0;
			for(int k=1; k<arr.length-1;k++) {
				sum+=arr[k];
			}
			System.out.println("#"+i+" "+Math.round((float)sum/(arr.length-2)));
		}
	}
}