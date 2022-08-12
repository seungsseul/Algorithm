import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase=0;
		while(true) {
			testcase++;	
			String word1 = sc.nextLine();
			String word2 = sc.nextLine();
			char[] arr1 = new char[word1.length()];
			char[] arr2 = new char[word2.length()];
			if (word1.equals("END") && word2.equals("END")) {
				break;
			}
			if(arr1.length==arr2.length) {
				for(int i=0;i<word1.length();i++) {
					arr1[i]=word1.charAt(i);
					arr2[i]=word2.charAt(i);
				}
			}
			else {
				System.out.println("Case "+testcase+": different");
				continue;
			}
			//두 배열에 철자가 같은 위치에 놓이도록 정렬
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int correct=0;
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					if(i==arr1.length-1) {
						System.out.println("Case "+testcase+": same");
					}
				}
				else {
					System.out.println("Case "+testcase+": different");
					break;
				}
			}
		}
		sc.close();
	}
}