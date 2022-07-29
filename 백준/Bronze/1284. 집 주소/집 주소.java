import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int sel = 0;
			int N  = sc.nextInt();
			if(N==0) {
				break;
			}
			String n = Integer.toString(N);
			sel += (n.length()+1);
			for(int i=0;i<n.length();i++) {
				if(n.charAt(i)=='0') {
					sel+=4;
				}
				else if(n.charAt(i)=='1') {
					sel+=2;
				}
				else {
					sel+=3;
				}
			}
			System.out.println(sel);
		}
	}
}