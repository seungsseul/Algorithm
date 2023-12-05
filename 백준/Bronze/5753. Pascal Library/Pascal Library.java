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
	static int N, D, countTokens;
	static int[] alumni; 
	public static void main(String[] args) throws IOException {
		loop:
		//전체 테스트케이스입니다
		while(true) {			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			D = Integer.parseInt(st.nextToken());
			//종료문
			if(N==0 && D==0) {
				break;
			}
			//동문의 명단 배열
			alumni = new int[N];
			
			for(int i=0;i<D;i++) {
				//저녁식사 하나씩 탐색
				st = new StringTokenizer(br.readLine());
				//동문의 명단 배열을 체크
				for(int j=0;j<N;j++) {
					//1이면 참석했단 소리니까 동문참석했다 체크
					if(Integer.parseInt(st.nextToken())==1) {
						alumni[j]++;
					}
				}
			}
			//최종명단 생성되었으니 비교
			for(int cnt : alumni) {
				//저녁식사 수와 동문의 참석수가 같을경우 yes하고 맨위로
				if(cnt==D) {
					sb.append("yes").append("\n");
					continue loop;
				}
			}
			//다 탐색했는데 저녁식사를 다참석한 사람이 없으면 no
			sb.append("no").append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}
