import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String sum = Integer.toString(A*B*C);
		int[] numArray = {0,1,2,3,4,5,6,7,8,9};
		int[] cntArray = new int[10];
		for(int i=0;i<numArray.length;i++) {
			for(int j=0;j<sum.length();j++) {
				if(numArray[i]==Character.getNumericValue(sum.charAt(j))) {
					cntArray[i]++;
				}
			}
			System.out.println(cntArray[i]);
		}
		sc.close();
	}
}