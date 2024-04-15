import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String N;
	static int[] visited;
	static int sixnine, set;
	public static void main(String[] args) throws IOException {
		N = br.readLine();
		visited = new int[10];
		for(int i=0;i<N.length();i++) {
			visited[Character.getNumericValue(N.charAt(i))]++;
		}
		sixnine = Math.min(visited[6], visited[9]);
		visited[6] = Math.abs(visited[6]-sixnine);
		visited[9] = Math.abs(visited[9]-sixnine);
		sixnine += (visited[6]+visited[9])%2==0 ? (visited[6]+visited[9])/2 : (visited[6]+visited[9])/2+1;
		set = 0;
		for(int i=0;i<visited.length-1;i++) {
			if(i==6) {
				continue;
			}
			set = Math.max(set, visited[i]);
		}
		bw.write(String.valueOf(Math.max(set, sixnine)));bw.flush();bw.close();br.close();
	}
}
