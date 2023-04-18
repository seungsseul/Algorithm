import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long K, ans, direc, jump;
    public static void main(String[] args) throws IOException {
        K = Math.abs(Long.parseLong(br.readLine()));
        direc=0;
        jump=1;
        ans=0;
        while(direc<K) {
        	ans++;
        	direc+=jump;
        	jump=jump+jump;
        }
        if(direc!=K) {
        	ans=-1;
        }
        bw.write(String.valueOf(ans));
        bw.flush();bw.close();br.close();
    }
}
