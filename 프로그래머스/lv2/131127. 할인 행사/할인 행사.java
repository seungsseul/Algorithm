import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
    	List<String> list = new ArrayList<>();
    	for(int i=0;i<want.length;i++) {
    		for(int j=0;j<number[i];j++) {
    			list.add(want[i]);
    		}
    	}
    	int idx=0;
    	for(int i=0;i<=discount.length-10;i++) {
    		List<String> tmp = new ArrayList<>();
    		for(int j=i;j<(i+10);j++) {
    			tmp.add(discount[j]);
    		}
    		for(int j=0;j<list.size();j++){
                tmp.remove(list.get(j));
            }
    		if(tmp.isEmpty()) {
    			answer++;
    		}
    	}
        return answer;
    }
}