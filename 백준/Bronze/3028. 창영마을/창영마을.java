import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] Input;
	static boolean[] cup;
	static int ans;
	public static void main(String[] args) throws IOException {
		Input = br.readLine().split("");
		cup = new boolean[3];
		cup[0] = true;
		for(int i=0;i<Input.length;i++) {
			if(Input[i].equals("A")) {
				swap(0, 1);
			}
			else if(Input[i].equals("B")) {
				swap(1, 2);
			}
			else {
				swap(0, 2);
			}
		}
		for(int i=0;i<cup.length;i++) {
			if(cup[i]) {
				ans = i+1;
				break;
			}
		}
		bw.write(String.valueOf(ans));bw.flush();bw.close();br.close();
	}
	static void swap(int a, int b) {
		boolean tmp = cup[a];
		cup[a] = cup[b];
		cup[b] = tmp;
	}
}
