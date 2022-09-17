import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine());
		BigInteger mul = new BigInteger("1");
		BigInteger num = new BigInteger("1");
		while(N.compareTo(mul)!=-1) {
			num = num.multiply(mul);
			mul = mul.add(new BigInteger("1"));
		}
		String Mul = String.valueOf(num);
		int cnt = 0;
		for(int i=Mul.length()-1;i>=0;i--) {
			if(Mul.charAt(i)!='0') {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}