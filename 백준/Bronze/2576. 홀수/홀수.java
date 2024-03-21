import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();	
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	static int num, sum;
	public static void main(String[] args) throws IOException {
		for(int i=0;i<7;i++) {
			num = Integer.parseInt(br.readLine());
			if(num%2!=0) {
				pq.offer(num);
			}
		}
		if(pq.isEmpty()) {
			sb.append(-1);
		}
		else {
			num = pq.poll();
			sum = num;
			for(int n : pq) {
				sum+=n;
			}
			sb.append(sum).append("\n").append(num);
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}
