import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.next();
		int len = message.length();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=len;i++) {
			if(len%i==0) {
				list.add(i);
			}
		}
		int R;
		if(list.size()<=2) {
			R = 1;
		}
		else {
			if(list.size()%2==0) {
				R = list.get(list.size()/2-1);
			}
			else {				
				R = list.get(list.size()/2);
			}
		}
		int C = len/R;
		String[][] arr = new String[R][C];
		int idx=0;
		for(int j=0;j<C;j++) {
			for(int i=0;i<R;i++) {
				arr[i][j] = String.valueOf(message.charAt(idx));
				idx++;
			}
		}
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(arr[i][j]);
			}
		}
		sc.close();	
	}
}