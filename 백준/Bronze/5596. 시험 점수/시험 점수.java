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
    static int minguk, manse;
    public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		minguk=0;
		for(int i=0;i<4;i++) {
			minguk+=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		manse=0;
		for(int i=0;i<4;i++) {
			manse+=Integer.parseInt(st.nextToken());
		}
		if(minguk>=manse) {
			bw.write(String.valueOf(minguk));
		}
		else {
			bw.write(String.valueOf(manse));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
