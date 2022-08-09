import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			String stringdate = sc.next();
			int date = Integer.parseInt(stringdate);
			String fd = stringdate.substring(0,4);
			String sd = stringdate.substring(4,6);
			String td = stringdate.substring(6);
			int testdate = date%10000;
			int month = testdate/100;
			int day = testdate%100;
			if(month>=1 && month<=12) {
				if(month==2) {
					if(day<=28) {
						System.out.println("#"+i+" "+fd+"/"+sd+"/"+td);
						continue;
					}
				}
				else {
					if((month<8 && month%2!=0) || (month>=8 && month%2==0)) {
						if(day<=31) {
							System.out.println("#"+i+" "+fd+"/"+sd+"/"+td);
							continue;
						}
					}
					else {
						if(day<=30) {
							System.out.println("#"+i+" "+fd+"/"+sd+"/"+td);
							continue;
						}
					}
				}
			}
			System.out.println("#"+i+" -1");
		}
		sc.close();
	}
}