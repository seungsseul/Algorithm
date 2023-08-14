
import java.io.*;

public class Solution {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String[] a = br.readLine().split("");
        for(int i=0;i<a.length;i++) {
            sb.append(a[i]).append("\n");
        }
        bw.write(sb.toString());bw.close();br.close();
    }
}   