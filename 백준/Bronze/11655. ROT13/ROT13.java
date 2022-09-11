import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String sentence = br.readLine();
		char spell;
		for(int i=0;i<sentence.length();i++) {
			//sentence.charAt(i)가 대문자일 경우
			if(65<=sentence.charAt(i) && sentence.charAt(i)<=90) {
				spell = (char) (sentence.charAt(i)+13);
				//90를 넘게된다면 대문자가 아니게 되므로 현 spell에 90빼주고 그 spell을 64에 더하기
				if(spell>90) {
					spell = (char) (spell-90);
					spell = (char) (64+spell);
				}
				sb.append(spell);
			}
			//sentence.charAt(i)가 소문자일 경우
			else if (97<=sentence.charAt(i) && sentence.charAt(i)<=122) {
				spell = (char) (sentence.charAt(i)+13);
				//122를 넘게된다면 소문자가 아니게 되므로 현 spell에 122빼주고 그 spell을 96에 더하기
				if(spell>122) {
					spell = (char) (spell-122);
					spell = (char) (96+spell);
				}
				sb.append(spell);
			}
			//숫자나 공백일 경우
			else {
				sb.append(sentence.charAt(i));
			}
		}
		System.out.println(sb);
		br.close();
	}
}