import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] arr;
	static String[] array = {"A", "B", "C"};
	static int sum;
	static String ans;
	public static void main(String[] args) throws IOException {
		arr = br.readLine().split(" ");
		sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+Integer.parseInt(arr[2]);
		if(sum==1) {
			for(int i=0;i<arr.length;i++) {
				if(Integer.parseInt(arr[i])==1) {
					ans = array[i];
				}
			}
		}
		else {
			ans = "*";
			if(sum==2) {
				for(int i=0;i<arr.length;i++) {
					if(Integer.parseInt(arr[i])==0) {
						ans = array[i];
					}
				}
			}
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}
