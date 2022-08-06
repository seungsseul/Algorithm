import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			int A=sc.nextInt();
			arr[i]=A;
		}
		Arrays.sort(arr);
		for(int i=2;i<=arr[num-1];i++) {
			if(arr[0]==i) {
				int N=arr[num-1]*i;
				System.out.println(N);
			}
		}
		sc.close();
	}
}