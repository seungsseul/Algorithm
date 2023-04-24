import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int T, idx;
	static String Input, reverseInput, Decal;
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		loop:
		for(int t=1;t<=T;t++) {
			Input = br.readLine();
			reverseInput="";
			for(int i=Input.length()-1;i>=0;i--) {
				reverseInput+=String.valueOf(Input.charAt(i));
			}
			Decal=String.valueOf(Integer.parseInt(Input)+Integer.parseInt(reverseInput));
			idx=Decal.length()-1;
			for(int i=0;i<Decal.length()/2;i++) {
				if(Decal.charAt(i)!=Decal.charAt(idx)) {
					sb.append("NO").append("\n");
					continue loop;
				}
				idx--;
			}
			sb.append("YES").append("\n");

		}

		bw.write(sb.toString());
		bw.flush();bw.close();br.close();
	}
}
