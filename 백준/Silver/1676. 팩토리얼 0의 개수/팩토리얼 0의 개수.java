import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//팩토리얼은 수가 매우 크므로 BigInteger 활용
		BigInteger N = new BigInteger(br.readLine());
		BigInteger mul = new BigInteger("1");
		BigInteger num = new BigInteger("1");
		//N! 구하기
		while(N.compareTo(mul)!=-1) {
			num = num.multiply(mul);
			mul = mul.add(new BigInteger("1"));
		}
		//N!을 문자열로 바꾸고 charAt()으로 뒤에서부터 탐색해서 0이 아닐때까지 카운트
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
