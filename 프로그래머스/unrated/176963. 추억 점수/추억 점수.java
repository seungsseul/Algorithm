import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> list = new ArrayList<>();
		int sum=0;
		//완전탐색
		for(int i=0;i<photo.length;i++) {
			sum=0;
			for(int j=0;j<photo[i].length;j++) {
				for(int p=0;p<name.length;p++) {
					
					if(photo[i][j].equals(name[p])) {
						sum+=yearning[p];
						break;
					}
				}

			}
			System.out.println(sum);
			list.add(sum);
		}

		int[] answer = new int[list.size()];
	    	//리스트 배열로 바꿔주고 출력
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
        return answer;
    }
    
}
