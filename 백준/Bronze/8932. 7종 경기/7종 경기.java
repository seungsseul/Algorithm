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
	static StringBuilder sb = new StringBuilder();
	static int T, score;
	static double[] hurdle = {9.23076, 26.7, 1.835, 0, 0};  
	static double[] highjump = {1.84523, 75, 1.348, 0, 1};  
	static double[] shotput = {56.0211, 1.5, 1.05, 0, 1};  
	static double[] twohundredmeter = {4.99087, 42.5, 1.81, 0, 0};  
	static double[] longjump = {0.188807, 210, 1.41, 0, 1};  
	static double[] javelinthrow = {15.9803, 3.8, 1.04, 0, 1};  
	static double[] eighthundredmeter = {0.11193, 254, 1.88, 0, 0}; 
	static double[][] heptathlon = {hurdle, highjump, shotput, twohundredmeter, longjump, javelinthrow, eighthundredmeter};
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			score = 0;
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<7;i++) {
				heptathlon[i][3] = Integer.parseInt(st.nextToken());				
				score += heptathlon[i][4]==0 ? track(heptathlon[i]) : field(heptathlon[i]);
			}
			sb.append(score).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
	static int track(double[] event) {
		return (int)(event[0]*Math.pow((event[1]-event[3]),event[2]));
	}
	static int field(double[] event) {
		return (int)(event[0]*Math.pow((event[3]-event[1]),event[2]));
	}
}
