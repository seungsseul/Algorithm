import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String Input;
	static int cnt, max;
	static int[] idx;
	static List<Integer> list;
	public static void main(String[] args) throws IOException {
		Input = br.readLine().toUpperCase();
		idx = new int[26];
		for(int i=0;i<Input.length();i++) {
			idx[Input.charAt(i)-65]++;
		}
		max=0;
		list = new ArrayList<>();
		for(int i=0;i<idx.length;i++) {
			if(max<idx[i]) {
				max=idx[i];
				list.clear();
				list.add(i);
			}
			else if(max==idx[i]) {
				list.add(i);
			}
		}
		if(list.size()>1) {
			bw.write("?");
		}
		else {
			bw.write((char)(list.get(0)+65));
		}
		bw.flush();bw.close();br.close();
	}
}
