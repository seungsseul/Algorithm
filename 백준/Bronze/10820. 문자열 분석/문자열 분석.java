import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = "";
		while((N = br.readLine()) != null) {
			int lower = 0;
			int upper = 0;
			int num = 0;
			int blank = 0;
			for(int i=0;i<N.length();i++) {
				if(97<=N.charAt(i) && N.charAt(i)<=122) {
					lower++;
				}
				else if(65<=N.charAt(i) && N.charAt(i)<=90) {
					upper++;
				}
				else if(48<=N.charAt(i) && N.charAt(i)<=57) {
					num++;
				}
				else {
					blank++;
				}
			}
			sb.append(lower).append(" ").append(upper).append(" ").append(num).append(" ").append(blank).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}