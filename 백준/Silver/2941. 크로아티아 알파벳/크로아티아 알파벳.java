import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String ans = "";
		int cnt=0;
		for(int i=1;i<word.length();i++) {
			ans += String.valueOf(word.charAt(i-1));
			ans += String.valueOf(word.charAt(i));
			
			if(ans.equals("c=") || ans.equals("c-") || ans.equals("d-") || ans.equals("lj") || ans.equals("nj") || ans.equals("s=") || ans.equals("z=")) {
				cnt++;
				cnt--;
				if(ans.equals("z=")) {
					if(i-2>=0) {
						if(word.charAt(i-2)=='d') {
							cnt--;
						}
					}
				}
			}
			else {
				cnt++;				
			}
			ans="";
		}
		System.out.println(cnt+1);
		sc.close();
	}
}