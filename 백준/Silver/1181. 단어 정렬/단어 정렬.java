import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		arr[0]=sc.next();
		int tmpidx=0;
		String tmp="";
		for(int t=1;t<N;t++) {
			arr[t] = sc.next();
			tmpidx=t;
			while(t>0) {				
				if(arr[t].length()<arr[t-1].length()) {
					tmp=arr[t-1];
					arr[t-1]=arr[t];
					arr[t]=tmp;
				}
				else if(arr[t].length()==arr[t-1].length()) {
					Arrays.sort(arr, t-1, t+1);
				}
				t--;
			}
			t = tmpidx;
		}
		System.out.println(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(!(arr[i].equals(arr[i-1]))) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}