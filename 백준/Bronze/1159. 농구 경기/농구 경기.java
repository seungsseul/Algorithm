import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N;
	static int[] arr;
	static String ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new int[26];
		for(int t=1;t<=N;t++) {
			arr[br.readLine().charAt(0)-97]++;
		}
		ans="";
		for(int i=0;i<26;i++) {
			if(arr[i]>=5) {
				ans+=String.valueOf((char)(i+97));
			}
		}
		if(ans.equals("")) {
			bw.write("PREDAJA");
		}
		else {
			bw.write(ans);
		}
		bw.flush();bw.close();br.close();
	}
}
