import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int cnt, S, E, Q, time;
	static String Input, sTMP, eTMP, qTMP, timeTmp, nameTmp, tmp;
	static HashMap<String, Integer> map;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		sTMP = st.nextToken(); //개강총회 시작시간
		eTMP = st.nextToken(); //개강총회 종료시간
		qTMP = st.nextToken(); //개강총회 스트리밍을 끝낸 시간
		tmp="";
		tmp+=String.valueOf(sTMP.charAt(0));
		tmp+=String.valueOf(sTMP.charAt(1));
		tmp+=String.valueOf(sTMP.charAt(3));
		tmp+=String.valueOf(sTMP.charAt(4));
		S = Integer.parseInt(tmp);
		tmp="";
		tmp+=String.valueOf(eTMP.charAt(0));
		tmp+=String.valueOf(eTMP.charAt(1));
		tmp+=String.valueOf(eTMP.charAt(3));
		tmp+=String.valueOf(eTMP.charAt(4));
		E = Integer.parseInt(tmp);
		tmp="";
		tmp+=String.valueOf(qTMP.charAt(0));
		tmp+=String.valueOf(qTMP.charAt(1));
		tmp+=String.valueOf(qTMP.charAt(3));
		tmp+=String.valueOf(qTMP.charAt(4));
		Q = Integer.parseInt(tmp);
		map = new HashMap<>();
		cnt=0;
		while((Input=br.readLine())!=null&&!Input.isEmpty()) {
			st = new StringTokenizer(Input);
			timeTmp = st.nextToken();
			nameTmp = st.nextToken();
			tmp="";
			tmp+=String.valueOf(timeTmp.charAt(0));
			tmp+=String.valueOf(timeTmp.charAt(1));
			tmp+=String.valueOf(timeTmp.charAt(3));
			tmp+=String.valueOf(timeTmp.charAt(4));
			time=Integer.parseInt(tmp);
			if(time<=S) {
				map.put(nameTmp, 0);
			}
			else {
				if((time>=E && time<=Q)) {
					if(map.get(nameTmp)!=null) {
						map.remove(nameTmp);
						cnt++;
					}
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}
