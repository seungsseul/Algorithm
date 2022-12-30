import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String N, rN, tmp;
	static long Num, rNum;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		N = br.readLine();
		if(N.equals("1")) {
			bw.write("no");
		}
		else {
			rN="";
			flag=true;
			for(int i=N.length()-1;i>=0;i--) {
				tmp = String.valueOf(N.charAt(i));
				if(tmp.equals("4") || tmp.equals("7") || tmp.equals("3")) {
					flag=false;
					break;
				}
				else if(tmp.equals("6")) {
					tmp="9";
				}
				else if(tmp.equals("9")) {
					tmp="6";
				}
				rN += tmp;
			}
			if(flag) {
				Num=Long.parseLong(N);;
				for(long i = 2; i <= (long)Math.sqrt(Num); i++) {
					if(Num%i==0) {
						flag=false;
						break; 
					} 
				}              
				if(flag) {
					rNum=Long.parseLong(rN);
					for(long i = 2; i <= (long)Math.sqrt(rNum); i++) {
						if(rNum%i==0) {
							flag=false;
							break; 
						} 
					}
					if(flag) {
						bw.write("yes");
					}
					else {
						bw.write("no");
					}
				}
				else {					
					bw.write("no");
				}
			}
			else {
				bw.write("no");
			}
		}
		bw.flush();bw.close();br.close();
	}
}
