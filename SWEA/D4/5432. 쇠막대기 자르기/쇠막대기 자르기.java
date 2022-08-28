import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			String arrange= sc.next();
			int stick = 0;
			int piece = 0;
			for(int i=0;i<arrange.length()-1;i++) {
				if(arrange.charAt(i)=='(' && arrange.charAt(i+1)!=')') {
					stick++;
				}
				else if(arrange.charAt(i)=='(' && arrange.charAt(i+1)==')') {
					piece+=stick;
					i=i+1;
				}
				else if(arrange.charAt(i)==')' && arrange.charAt(i-1)!='(') {
					stick--;
					piece++;
				}
			}
			System.out.println("#"+t+" "+(piece+1));
		}
		sc.close();
	}
}