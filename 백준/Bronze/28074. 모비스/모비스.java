import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] arr;
	static boolean[] visited;
	static char tmp;
	static String ans;
	public static void main(String[] args) throws IOException {
		arr = br.readLine().split("");
		visited = new boolean[arr.length];
		ans = "YES";
		loop:
		for(int i=0;i<5;i++) {
			tmp = "MOBIS".charAt(i);
			for(int j=0;j<arr.length;j++) {
				if(String.valueOf(tmp).equals(arr[j]) && !visited[j]) {
					visited[j] = true;
					continue loop;
				}
			}
			ans = "NO";
			break;
		}
		bw.write(ans);bw.flush();bw.close();br.close();
	}
}
