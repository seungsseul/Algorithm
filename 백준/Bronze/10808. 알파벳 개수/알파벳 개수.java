import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String Alpabet = "abcdefghijklmnopqrstuvwxyz";
		char[] arr = new char[26];
		int[] idx_arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Alpabet.charAt(i);
		}
		for(int i=0;i<S.length();i++) {
			for(int j=0;j<arr.length;j++) {
				if(S.charAt(i)==arr[j]) {
					idx_arr[j]++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<idx_arr.length;i++) {
			sb.append(idx_arr[i]).append(" ");
		}
		System.out.println(sb);
		sc.close();
	}
}
