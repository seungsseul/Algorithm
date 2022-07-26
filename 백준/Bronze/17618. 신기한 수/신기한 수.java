import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i=1;i<=N;i++) {
			String x = Integer.toString(i);
			int sum = 0;
			for(int j=0;j<x.length();j++) {
				int result = Character.getNumericValue(x.toCharArray()[j]);
				sum += result;
			}
			if(i%sum==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}