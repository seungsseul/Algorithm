import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String Input, ans;
	static char[] arr;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		arr = new char[Input.length()];
		for(int i=0;i<Input.length();i++) {
			arr[i]=Input.charAt(i);
		}
		ans="";
		for(int i=0;i<Input.length();i++) {
			if(arr[i]-3>=65) {
				ans += String.valueOf((char) (arr[i]-3));
			}
			else {
				ans += String.valueOf((char) (91-(65-(arr[i]-3))));
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
		br.close();
	}
}
