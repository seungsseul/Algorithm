import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for(int t=1;t<=3;t++) {
			int N = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			for(int i=0;i<N;i++) {
				sum=sum.add(sc.nextBigInteger());
			}
			if(sum.compareTo(new BigInteger("0"))==0) {
				sb.append(0).append("\n");
			}
			else if(sum.compareTo(new BigInteger("0"))==1) {
				sb.append("+").append("\n");
			}
			else if(sum.compareTo(new BigInteger("0"))==-1) {
				sb.append("-").append("\n");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
