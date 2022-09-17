import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int temp = T;
		int[] arr = new int[N];
		List<Integer> result = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=0;j--) {
				for(int k=arr.length-1;k>=0;k--) {
					if(i!=j && j!=k && k!=i) {
						T=temp;
						T-=arr[i];
						T-=arr[j];
						T-=arr[k];
						if(T>=0) {
							result.add(arr[i]+arr[j]+arr[k]);
						}
					}
				}
			}
		}
		Collections.sort(result, Collections.reverseOrder());
		System.out.println(result.get(0));
		sc.close();
	}
}