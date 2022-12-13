import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int X, N, vote;
	static String staff, sc;
//	static Map<String, Integer> map;
	static Map<Float, String> chip;
	static List<Float> list;
	static List<String> ans, staff_name;
	static int[] chip_cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		X = Integer.parseInt(br.readLine()); //전체 참가자 수
		N = Integer.parseInt(br.readLine()); //전체 스태프 수
//		map = new HashMap<String, Integer>();
		chip = new HashMap<Float, String>(); //점수집합과 해당스태프를 가진 map
		list = new ArrayList<Float>(); //점수집합만을 가진 list
		staff_name = new ArrayList<String>(); //스태프이름 리스트
		
		for(int t=0;t<N;t++) {
			st = new StringTokenizer(br.readLine());
			staff = st.nextToken();
			vote = Integer.parseInt(st.nextToken());
			//5% 미만의 득표를 얻은 스태프는 제외
			if(X*0.05<=vote) {				
//				map.put(staff, vote);
				//스태프이름 리스트에 스태프 추가
				staff_name.add(staff);
				//1부터 14까지 for문돌면서 득표수를 i로 나눈 값을 map과 list에 저장
				//map에는 key값으로 득표수, value값으로 스태프이름
				for(int i=1;i<=14;i++) {
					chip.put((float) (vote/i), staff);
					list.add((float) (vote/i));
				}
			}
		}
		//가장 큰 점수부터 살펴보기 위해 정렬
		Collections.sort(list);
		
		//스태프가 가진 칩수 리스트 (초기값 0)
		chip_cnt = new int[staff_name.size()]; 
		//리스트의 마지막수(=가장 큰수) 부터 14번째 수까지 돌면서 해당 스태프한테 칩 나눠주기
		Loop:
		for(int i=list.size()-1;i>=list.size()-14;i--) {
			//sc = 칩을 받을 스태프이름
			sc = chip.get(list.get(i));
			for(int j=0;j<staff_name.size();j++) {
				//만약 스태프리스트에 헤당 칩을 받을 스태프가 있다면 해당 위치의 칩인덱스 증가
				if(staff_name.get(j).equals(sc)) {
					chip_cnt[j]++;
					continue Loop;
				}
			}
		}

		//정답 배열 생성
		ans = new ArrayList<>();
		for(int i=0;i<staff_name.size();i++) {			
			ans.add(staff_name.get(i)+" "+String.valueOf(chip_cnt[i]));
		}
		Collections.sort(ans);
		for(int i=0;i<ans.size();i++) {
			st = new StringTokenizer(ans.get(i));
			sb.append(st.nextToken()).append(" ").append(Integer.parseInt(st.nextToken())).append("\n");
		}
		bw.write(sb.toString());
		bw.close();br.close();
	}
}
