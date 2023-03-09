import java.io.*;
import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
		String ans = "";
		List<int[]> list = new ArrayList<>();
		
		int[] arrx = new int[10];
		int[] arry = new int[10];
		for(int i=0;i<X.length();i++) {
			arrx[X.charAt(i)-48]++;
		}
		for(int i=0;i<Y.length();i++) {
			arry[Y.charAt(i)-48]++;
		}

		for(int i=0;i<10;i++) {
			if(arrx[i]!=0 && arry[i]!=0) {
				int[] tmp = {i,Math.min(arrx[i], arry[i])};
				list.add(tmp);
			}
		}
		if(list.size()==1 && list.get(0)[0]==0) {
			ans="0";
		}
		else {
			List<String> list2 = new ArrayList<>();
			for(int i=0;i<list.size();i++) {

				for(int j=0;j<list.get(i)[1];j++) {
					list2.add(String.valueOf(list.get(i)[0]));
				}
			}

	 		if(list2.isEmpty()) {
				ans="-1";
			}
			else {
				for(int i=list2.size()-1;i>=0;i--) {
					sb.append(list2.get(i));
				}
				ans=sb.toString();
				
			}
		}
		
		return ans;
    }
}