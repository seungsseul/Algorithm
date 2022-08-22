import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int t=1;t<=N;t++) {
			st=new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int[] arrA = new int[A];
			for(int i=0;i<A;i++) {				
				arrA[i] = Integer.parseInt(st.nextToken());
			}
			st=new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			int[] arrB = new int[B];
			for(int i=0;i<B;i++) {				
				arrB[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arrA);
			Arrays.sort(arrB);
			int[] arr_A = new int[arrA.length];
			int[] arr_B = new int[arrB.length];
			int num=0;
			for(int i=arrA.length-1;i>=0;i--) {
				arr_A[num]=arrA[i];
				num++;
			}
			num=0;
			for(int i=arrB.length-1;i>=0;i--) {
				arr_B[num]=arrB[i];
				num++;
			}
			
			for(int i=0;i<Math.min(arr_A.length, arr_B.length);i++) {
				if(arr_A[i]>arr_B[i]) {
					System.out.println("A");
					break;
				}
				else if(arr_A[i]<arr_B[i]) {
					System.out.println("B");
					break;
				}
				else {
					if(i==Math.min(arr_A.length-1, arr_B.length-1) && arr_A.length==arr_B.length) {
						System.out.println("D");
						break;
					}
					else if(i==Math.min(arr_A.length-1, arr_B.length-1) && arr_A.length>arr_B.length) {
						System.out.println("A");
						break;
					}
					else if(i==Math.min(arr_A.length-1, arr_B.length-1) && arr_A.length<arr_B.length) {
						System.out.println("B");
						break;
					}
				}
			}
		}
	}
}