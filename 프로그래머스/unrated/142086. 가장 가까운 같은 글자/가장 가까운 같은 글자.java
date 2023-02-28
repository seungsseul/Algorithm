import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
		List<String> stringlist = new ArrayList<>();
		list.add(-1);
		stringlist.add(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++) {
			if(!stringlist.contains(String.valueOf(s.charAt(i)))) {
				list.add(-1);
				stringlist.add(String.valueOf(s.charAt(i)));
			}
			else {
				for(int j=stringlist.size()-1;j>=0;j--) {
					if(String.valueOf(s.charAt(i)).equals(stringlist.get(j))) {
						list.add(i-j);
						stringlist.add(String.valueOf(s.charAt(i)));
						break;
					}
				}
			}
		}
		
		int[] ans = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			ans[i]=list.get(i);
		}
		return ans;
    }
}