import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if (i==j) {
					if(j==4) {
						System.out.print("#"+"\n"); 
					}
					else {
						System.out.print("#"); 
					}
				}
				else {
					if(j==4) {
						System.out.print("+"+"\n");
					}
					else {
						System.out.print("+"); 
					}
				}
			}
		}
	}
}