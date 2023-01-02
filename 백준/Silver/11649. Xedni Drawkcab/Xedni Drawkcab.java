import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static String word, tmp;
	static String[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr = new String[N];
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		for(int i=N-1;i>=0;i--) {
			word = arr[i];
			tmp="";
			for(int j=word.length()-1;j>=0;j--) {
				tmp+=word.charAt(j);
			}
			arr[i]=tmp;
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			sb.append(arr[i]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}
