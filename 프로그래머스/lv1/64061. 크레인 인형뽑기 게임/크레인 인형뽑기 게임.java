import java.util.ArrayList;
import java.util.List;
public class Solution {
	static List<Integer> basket;
    public static int solution(int[][] board, int[] moves) {
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
