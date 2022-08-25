import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int[] arr = new int[S+1];
		for(int i=1;i<=S;i++) {
			arr[i]=sc.nextInt();
		}
		int hm=sc.nextInt();
		for(int i=0;i<hm;i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();
			if(sex==1) {
				for(int j=num;j<arr.length;j+=num) {
					if(arr[j]==0) {
						arr[j]++;
					}
					else {
						arr[j]--;
					}
				}
			}
			else if(sex==2) {
				int left=num-1;
				int right = num+1;
				int cnt=0;
				while(true) {
					if(left<1 || right>S) {
						break;
					}
					if(arr[left]==arr[right]) {
						cnt++;
						left--;
						right++;
					}
					else {
						break;
					}
				}
				for(int j=num-cnt;j<=num+cnt;j++) {
					if(arr[j]==0) {
						arr[j]++;
					}
					else {
						arr[j]--;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<arr.length;i++) {
			sb.append(arr[i]);
			if(i%20==0) {
				sb.append("\n");
			}
			if(i%20!=0 && i!=arr.length-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}