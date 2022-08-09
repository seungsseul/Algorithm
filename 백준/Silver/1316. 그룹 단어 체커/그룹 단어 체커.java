import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<N;i++) {
			String word = sc.next();
			String[] arr = new String[word.length()];
			arr[0]=String.valueOf(word.charAt(0));
			for(int j=0;j<word.length();j++) {
				if(j!=0) {
					String bw = String.valueOf(word.charAt(j-1));
					String aw = String.valueOf(word.charAt(j));
					if(aw.equals(bw)) {
						arr[j]=aw;
						continue;
					}
					if(Arrays.asList(arr).contains(aw)) {
						cnt++;
						break;
					}
					else {
						arr[j]=aw;
					}
				}
			}
		}
		System.out.println(N-cnt);
		sc.close();
	}
}