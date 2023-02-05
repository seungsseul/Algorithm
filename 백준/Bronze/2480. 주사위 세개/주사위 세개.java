import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int dice1, dice2, dice3, money;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		dice1 = Integer.parseInt(st.nextToken());
		dice2 = Integer.parseInt(st.nextToken());
		dice3 = Integer.parseInt(st.nextToken());
		if(dice1==dice2 && dice2==dice3) {
			money=10000+(dice1*1000);
		}
		else if((dice1==dice2 && dice2!=dice3) || (dice2==dice3 && dice2!=dice1) || (dice1==dice3 && dice2!=dice1)) {
			if(dice1==dice2) {
				money=1000+(dice1*100);
			}
			else if(dice2==dice3) {
				money=1000+(dice2*100);
			}
			else if(dice1==dice3) {
				money=1000+(dice1*100);
			}
		}
		else {
			money=Math.max(Math.max(dice1, dice2), dice3)*100;
		}
		bw.write(String.valueOf(money));
		bw.flush();bw.close();br.close();
	}
}
