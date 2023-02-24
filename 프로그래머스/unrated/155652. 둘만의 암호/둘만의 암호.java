import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String s, String skip, int index) {
       List<Integer> list = new ArrayList<>();
		String ans = "";
		for(int i=0;i<skip.length();i++) {
			list.add((int)skip.charAt(i));
		}
		int tmp;
		int idx=0;
		for(int i=0;i<s.length();i++) {
			idx=0;
			tmp = (int)s.charAt(i);
			while(true) {
				if(idx==index) {
					break;
				}
				tmp+=1;
				if(list.contains(tmp)) {
					continue;
				}
				if(tmp==123) {
					tmp=96;
					continue;
				}
				idx++;
			}
			ans = ans+String.valueOf((char)tmp);
		}
		return ans;
    }
}