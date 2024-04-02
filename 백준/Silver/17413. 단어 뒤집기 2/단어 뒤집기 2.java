import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static String Input, tmp;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		Input = br.readLine();
		tmp = "";
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)=='<') {
				if(!flag) {
					reverse(tmp);
					sb.append(tmp);
				}
				else { 
					sb.append(tmp);
				}
				tmp="";
				tmp+="<";
				flag = true;
				continue;
			}
			if(Input.charAt(i)=='>' && flag) {
				tmp+=">";
				flag = false;
				sb.append(tmp);
				tmp="";
				continue;
			}
			if(Input.charAt(i)==' ' && !flag) {
				reverse(tmp);
				sb.append(tmp).append(" ");
				tmp="";
				continue;
			}
			if(flag) {
				tmp+=String.valueOf(Input.charAt(i));
				continue;
			}
			else {
				tmp+=String.valueOf(Input.charAt(i));
			}
		}
		if(!flag) {
			reverse(tmp);
			sb.append(tmp);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static void reverse(String tmp2) {
		tmp="";
		for(int i=tmp2.length()-1;i>=0;i--) {
			tmp+=String.valueOf(tmp2.charAt(i));
		}
	}
}
