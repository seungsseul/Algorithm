import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		LinkedList<String> list = new LinkedList<>();
		for(int i=0;i<N.length();i++) {
			list.add(String.valueOf(N.charAt(i)));
		}
		//리스트를 양방향탐색 가능한 iterator 사용
		ListIterator<String> iter = list.listIterator();
		//커서를 리스트의 맨뒤로 이동
		while(iter.hasNext()) {
			iter.next();
		}
		for(int t=1;t<=M;t++) {
			st = new StringTokenizer(br.readLine());
			//countTokens()가 2이면 명령어는 P
			if(st.countTokens()==2) {
				st.nextToken();
				//iter가 위치한 현재 인덱스에 추가함
				iter.add(st.nextToken());
			}
			else {
				String order = st.nextToken();
				if(iter.hasPrevious()) {
					//인덱스 앞으로이동
					if(order.equals("L")) {
						iter.previous();
					}
					//왼쪽에 있는 요소를 제거하므로 인덱스 앞으로 이동후 제거
					else if(order.equals("B")) {
						iter.previous();
						iter.remove();
					}
				}
				if(iter.hasNext()) {		
					//인덱스 뒤로이동
					if(order.equals("D")) {
						iter.next();
					}
				}
			}
		}
		for(String i : list) {
			sb.append(i);
		}
		System.out.println(sb);
		br.close();
	}
}