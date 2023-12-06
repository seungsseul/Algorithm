import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] word1, word2;
	static List<String> list;
	static int cnt;
	public static void main(String[] args) throws IOException {
		word1 = br.readLine().split("");
		word2 = br.readLine().split("");
		list = new ArrayList<String>(Arrays.asList(word1));
		cnt = 0;
		for(String word : word2) {
			if(list.contains(word)) {
				cnt++;
				list.remove(word);
			}
		}
		bw.write(String.valueOf(list.size()+(word2.length-cnt)));bw.flush();bw.close();br.close();
	}
}
