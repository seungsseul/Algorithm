import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cupHolder = "*";
		int Lcnt = 0;
		int N = Integer.parseInt(br.readLine());
		String info = br.readLine();
		for(int i=0;i<info.length();i++) {
			if(info.charAt(i)=='S') {
				cupHolder+="S*";
			}
			else if(info.charAt(i)=='L') {
				cupHolder+="L";
				Lcnt++;
				if(Lcnt==2) {
					cupHolder+="*";
					Lcnt=0;
				}
			}
		}
		char[] arr = new char[cupHolder.length()];
		for(int i=0;i<cupHolder.length();i++) {
			arr[i] = cupHolder.charAt(i);
		}
		int starcnt=0;
		int alpacnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='*') {
				starcnt++;
			}
			else if(arr[i]=='S' || arr[i]=='L') {
				alpacnt++;
			}
		}
		if(alpacnt>=starcnt) {
			System.out.println(starcnt);
		}
		else {
			System.out.println(alpacnt);
		}
		br.close();
	}
}