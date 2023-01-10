import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long angry;
	static int N, grade;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		angry=0;
		for(int t=0;t<N;t++) {
			grade = Integer.parseInt(br.readLine());
			arr[t]=grade;
		}	
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			angry+=Math.abs(arr[i]-(i+1));			
		}
		bw.write(String.valueOf(angry));
		bw.flush();bw.close();br.close();
	}
}
