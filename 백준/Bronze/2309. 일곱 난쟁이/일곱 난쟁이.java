import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int[] ans = new int[7];
		int sum=0;
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		int tmp=sum;
		Loop1:
		while(true) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(j!=i) {
						sum=tmp;
						sum-=arr[i];
						sum-=arr[j];
						if(sum==100) {
							arr[i]=0;
							arr[j]=0;
							break Loop1;
						}
					}
				}
			}
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<9;j++) {
				if(arr[j]!=0) {
					ans[i]=arr[j];
					arr[j]=0;
					break;
				}
			}
		}
		Arrays.sort(ans);
		for(int i=0;i<7;i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}