import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] arr = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
	static String Input;
	static long ans;
	public static void main(String[] args) throws IOException {
		ans=0;
		for(int i=0;i<2;i++) {
			Input = br.readLine();
			for(int j=0;j<arr.length;j++) {
				if(Input.equals(arr[j])) {
					if(i==0) {						
						ans+=j*10;
					}
					else {
						ans+=j;
					}
				}
			}
		}
		Input=br.readLine();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(Input)) {
				ans*=Math.pow(10, i);
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
	}
}
