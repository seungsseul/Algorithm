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
    static int[] A, B;
    static int N, idx, sum;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	A[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        idx=0;
        sum=0;
        for(int i=A.length-1;i>=0;i--) {
        	sum+=(A[i]*B[idx]);
        	idx++;
        }
        bw.write(String.valueOf(sum));
        bw.flush();bw.close();br.close();
    }
    
}
