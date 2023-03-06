import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		for(int i=0;i<cards1.length;i++) {
			list1.add(cards1[i]);
		}
		for(int i=0;i<cards2.length;i++) {
			list2.add(cards2[i]);
		}
		boolean flag=true;
		for(int i=0;i<goal.length;i++) {
			if(!list1.isEmpty() && list1.get(0).equals(goal[i])) {
				list1.remove(0);
				continue;
			}
			if(!list2.isEmpty() && list2.get(0).equals(goal[i])) {
				list2.remove(0);
				continue;
			}
			flag=false;
		}
		String answer = "";
		if(flag) {
			answer="Yes";
		}
		else {
			answer="No";
		}
        return answer;
    }
}