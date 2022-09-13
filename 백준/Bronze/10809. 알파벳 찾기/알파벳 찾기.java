import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String S = sc.next();
		//char배열 만들어서 알파벳 하나씩 배열에 넣기
		char[] alpa = new char[26];
		int ASCII = 97;
		for(int i=0;i<26;i++) {
			alpa[i]=(char) ASCII;
			ASCII++;
		}
		//알파벳인덱스배열 만들어서 -1로 세팅하기
		int[] alpa_idx = new int[26];
		for(int i=0;i<26;i++) {
			alpa_idx[i]=-1;
		}
		//문자열 하나씩 뜯어서 만약 인덱스배열값이 -1이고 해당인덱스의 char배열값과 같다면 인덱스배열 값 해당 단어의 인덱스로 변경
		int idx=0;
		for(int i=0;i<S.length();i++) {
			for(int j=0;j<26;j++) {
				if(S.charAt(i)==alpa[j] && alpa_idx[j]==-1) {
					alpa_idx[j]=idx;
				}
			}
			idx++;
		}
		for(int i=0;i<26;i++) {
			sb.append(alpa_idx[i]).append(" ");
		}
		System.out.println(sb);
		sc.close();
	}
}