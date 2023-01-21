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
	static String[][] arr;
	static String Input;
	public static void main(String[] args) throws IOException {
		arr = new String[5][15];
		for(int i=0;i<5;i++) {
			Input = br.readLine();
			for(int j=0;j<15;j++) {
				if(Input.length()==j) {
					break;
				}
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		for(int j=0;j<15;j++) {
			for(int i=0;i<5;i++) {
				if(arr[i][j]==null) {
					continue;
				}
				sb.append(arr[i][j]);
			}
		}
		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}
