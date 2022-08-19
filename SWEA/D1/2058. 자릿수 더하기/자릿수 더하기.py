import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int one = N%10;
		int two = N%100/10;
		int three = N%1000/100;
		int four = N%10000/1000;
		System.out.println(one+two+three+four);
	}
}
