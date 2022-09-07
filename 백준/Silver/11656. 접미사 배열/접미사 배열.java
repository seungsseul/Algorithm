import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine();
		List<String> list = new ArrayList<>();
		//S의 처음인덱스부터 인덱스를 1씩 줄여가며 jms에 추가하고 jms를 list에 담기
		for(int i=0;i<S.length();i++) {
			String jms = "";
			for(int j=i;j<S.length();j++) {
				jms+=String.valueOf(S.charAt(j));
			}
			list.add(jms);
		}
		//리스트 오름차순 정렬
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}