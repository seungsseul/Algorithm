import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		int[] sum_arr = new int[10];
		for(int i=0;i<10;i++) {
			sum += arr[i];
			sum_arr[i] = sum;
		}
		int min=Integer.MAX_VALUE;
		int tmp=0;
		for(int i=0;i<10;i++) {
			sum_arr[i] = 100-sum_arr[i];
			sum_arr[i] = Math.abs(sum_arr[i]);
			if(sum_arr[i]<=min) {
				min=sum_arr[i];
				tmp=i;
			}
		}
		sum=0;
		for(int i=0;i<=tmp;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}