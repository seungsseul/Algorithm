import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0;i<testcase;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("#"+(i+1)+" "+a/b+" "+a%b);
		}
	}
}