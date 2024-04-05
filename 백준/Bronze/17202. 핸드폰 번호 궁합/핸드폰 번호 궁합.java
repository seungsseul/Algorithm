import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] A, B;
	static String phoneNumber, tmp, sum;
	public static void main(String[] args) throws IOException {
		A = br.readLine().split("");
		B = br.readLine().split("");
		phoneNumber="";
		for(int i=0;i<8;i++) {
			phoneNumber+=A[i];
			phoneNumber+=B[i];
		}
		while(true) {
			if(phoneNumber.length()==2) {
				break;
			}
			tmp = "";
			for(int i=0;i<phoneNumber.length()-1;i++) {
				sum = String.valueOf(Character.getNumericValue(phoneNumber.charAt(i))+Character.getNumericValue(phoneNumber.charAt(i+1)));
				tmp += sum.substring(sum.length()-1);
			}
			phoneNumber = tmp;
		}
		bw.write(phoneNumber);
		bw.flush();bw.close();br.close();
	}
}
