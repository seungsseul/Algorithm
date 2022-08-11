import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		do {
			T = sc.nextInt();
			String[] basic_arr = new String[T];
			String[] lowercase_arr = new String[T];
			String[] result_arr = new String[T];
			for(int i=0;i<T;i++) {
				String word = sc.next();
				String word2 = word.toLowerCase();
				basic_arr[i]=word;
				lowercase_arr[i]=word2;
				result_arr[i]=word2;
			}
			Arrays.sort(result_arr);
			for(int i=0;i<lowercase_arr.length;i++) {
				if(result_arr[0]==lowercase_arr[i]) {
					System.out.println(basic_arr[i]);
				}
			}
		}while(T!=0);
		sc.close();
	}
}