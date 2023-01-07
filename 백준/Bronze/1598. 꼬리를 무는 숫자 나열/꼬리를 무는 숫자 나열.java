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
	static long A,B, tmpA, tmpB, cnt, num;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		tmpA = Math.min(A,B);
		tmpB = Math.max(A, B);
		if(tmpA%4==1) {
			num=0;
		}
		else if(tmpA%4==2) {
			num=1;
		}
		else if(tmpA%4==3) {
			num=2;
		}
		else {
			num=3;
		}
		cnt=0;
		while(true) {
			tmpA+=4;
			cnt++;
			if(num==0 && (tmpB-tmpA<=3 && tmpB-tmpA>=0)) {
				cnt+=(tmpB-tmpA);
				break;
			}
			else if(num==1 && ((tmpB-tmpA<=2 && tmpB-tmpA>=0) || (tmpA-tmpB<=1) && tmpA-tmpB>=0)) {
				if(tmpA>=tmpB) {
					cnt+=(tmpA-tmpB);
				}
				else {
					cnt+=(tmpB-tmpA);
				}
				break;
			}
			else if(num==2 && ((tmpB-tmpA<=1 && tmpB-tmpA>=0) || (tmpA-tmpB<=2 && tmpA-tmpB>=0))) {
				if(tmpA>=tmpB) {
					cnt+=(tmpA-tmpB);
				}
				else {
					cnt+=(tmpB-tmpA);

				}
				break;
			}
			else if(num==3 && (tmpA-tmpB<=3 && tmpA-tmpB>=0)) {
				cnt+=(tmpA-tmpB);
				break;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}
