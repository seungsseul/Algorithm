import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int money, cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		money = 1000-Integer.parseInt(br.readLine());
		cnt=0;
		cnt+=(money/500);
		money = money-(money/500*500);
		cnt+=(money/100);
		money = money-(money/100*100);
		cnt+=(money/50);
		money = money-(money/50*50);
		cnt+=(money/10);
		money = money-(money/10*10);
		cnt+=(money/5);
		money = money-(money/5*5);
		cnt+=(money/1);
		money = money-(money/1*1);
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}
