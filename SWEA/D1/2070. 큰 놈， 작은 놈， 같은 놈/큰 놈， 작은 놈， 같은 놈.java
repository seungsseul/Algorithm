import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x>y) {
				System.out.println("#"+i+" >");
			}
			else if (x==y) {
				System.out.println("#"+i+" =");
			}
			else {
				System.out.println("#"+i+" <");
			}
		}
	}
}