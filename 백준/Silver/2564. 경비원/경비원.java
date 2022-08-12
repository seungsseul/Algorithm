import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int dule = (R+C)*2;
		int store = Integer.parseInt(br.readLine());
		
		int[] store_arr = new int[store+1]; //반시계방향 저장 값
		for(int t=1;t<=store+1;t++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int direc = Integer.parseInt(st2.nextToken());
			int far = Integer.parseInt(st2.nextToken());
			if(direc==1) { //북
				store_arr[t-1]=far;
			}
			else if(direc==2) { //남
				store_arr[t-1]=R+C+R-far;
			}
			else if(direc==3) { //서
				store_arr[t-1]=dule-far;
			}
			else if(direc==4) { //동
				store_arr[t-1]=R+C-(C-far);
			}
		}
		int[] clock = new int[store_arr.length-1];
		for(int i=0;i<store_arr.length-1;i++) {
			clock[i]=Math.abs(store_arr[store]-store_arr[i]);
		}
		int[] reverse_clock = new int[store_arr.length-1];
		for(int i=0;i<store_arr.length-1;i++) {
			reverse_clock[i]=dule-(Math.abs(store_arr[store]-store_arr[i]));
		}
		int sum = 0;
		for(int i=0;i<store_arr.length-1;i++) {
			sum+=Math.min(clock[i], reverse_clock[i]);
		}
		System.out.println(sum);
	}
}