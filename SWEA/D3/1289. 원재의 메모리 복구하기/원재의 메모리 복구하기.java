import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			String bit = sc.next();
			String reset = "";
			int cnt=0;
			if(bit.length()!=1) {
				if(bit.charAt(0)=='1') {
					reset="1";
					cnt++;
				}
				for(int i=1;i<bit.length();i++) {
					if(bit.charAt(i)!=bit.charAt(i-1)) {
						for(int j=i;j<bit.length();j++) {						
							reset+=String.valueOf(bit.charAt(i));
						}
						cnt++;
					}
				}
				System.out.println("#"+t+" "+cnt);
			}
			else {
				if(bit=="1") {
					System.out.println("#"+t+" "+cnt+1);
				}
				else {
					System.out.println("#"+t+" "+cnt);
				}
			}
		}
		sc.close();
	}
}