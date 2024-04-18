import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int B, C, D, sum, ans;
	static int[][] menu;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		menu = new int[3][Math.max(B, Math.max(C,D))];
		sum = 0;
		menuSetting(B, 0);
		menuSetting(C, 1);
		menuSetting(D, 2);
		sb.append(sum).append("\n");
		ans = 0;
		for(int i=0;i<menu[0].length;i++) {
			sum = 0;
			flag = true;
			for(int j=0;j<3;j++) {
				if(menu[j][i]==0) {
					flag = false;
				}
				sum+=menu[j][i];
			}
			sum = (int) (flag ? sum*0.9 : sum);
			ans+=sum;
		}
		sb.append(ans);
		bw.write(sb.toString());bw.close();br.close();
	}
	static void menuSetting(int category, int num) throws IOException {
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<category;i++) {
			menu[num][i]=Integer.parseInt(st.nextToken());
			sum+=menu[num][i];
		}
		Arrays.sort(menu[num]);
	}
}
