import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int k, int[] arr) {
        int[] ans= new int[arr.length];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i+1<=k) {
				list.add(arr[i]);
				Collections.sort(list);
				ans[i]=list.get(0);
			}
			else {
				list.add(arr[i]);
				Collections.sort(list);
				ans[i]=list.get(1);
				list.remove(0);
			}
		}
		return ans;
    }
}