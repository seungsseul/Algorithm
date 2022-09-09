import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Alpa = "abcdefghijklmnopqrstuvwxyz";
		String BigAlpa = Alpa.toUpperCase();
		String Input = sc.nextLine();
		String[] arr = BigAlpa.split("");
		String[] arr2 = Input.split("");
		for(int i=0;i<Input.length();i++) {
			for(int j=0;j<BigAlpa.length();j++) {
				if (arr2[i].equals(arr[j])) {
					if (i==Input.length()-1) {
						System.out.print(j+1);
					}
					else {
						System.out.print(j+1+" ");
					}
				}
				
			}
		}
	}
}