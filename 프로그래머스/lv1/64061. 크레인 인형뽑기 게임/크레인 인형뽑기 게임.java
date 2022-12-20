import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
//	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	static StringTokenizer st;
//	static int N, answer;
//	static int[][] board;
//	static int[] moves;
	static List<Integer> basket;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		bw.write(String.valueOf(solution(board, moves)));
//		bw.flush();bw.close();br.close();
//	}
    public static int solution(int[][] board, int[] moves) throws IOException {
    	int N = board.length;
    	basket = new ArrayList<Integer>();
        int answer = 0;
		loop:
		for(int t=0;t<moves.length;t++) {			
			for(int i=0;i<N;i++) {
				if(board[i][moves[t]-1]!=0) {
					basket.add(board[i][moves[t]-1]);
					board[i][moves[t]-1]=0;
					continue loop;
				}
			}
		}
		loop2:
			while(true) {			
				for(int i=1;i<basket.size();i++) {
					if(basket.get(i)==basket.get(i-1)) {
						basket.remove(i);
						basket.remove(i-1);
						answer+=2;
						continue loop2;
					}
				}
				break;
			}
        return answer;
    }
}
