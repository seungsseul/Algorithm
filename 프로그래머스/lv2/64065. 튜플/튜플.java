import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    static int[] arr, answer;
	static Map<Integer, Integer> map;
	static List<Integer> list, list2;
	static String tmp;
	static int num, idx;
    public int[] solution(String s) {
       map = new HashMap<>();
		list = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		tmp=""; //실제 원소 숫자
		arr = new int[100001];
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				tmp+=String.valueOf(s.charAt(i));
				if(s.charAt(i+1)==',' || s.charAt(i+1)=='}') {
					list2.add(Integer.parseInt(tmp));
					tmp="";
				}
			}
		}
		for(int i=0;i<list2.size();i++) {
			arr[list2.get(i)]++;
		}
		Collections.sort(list2);
		for(int i=1;i<=list2.get(list2.size()-1);i++) {
			if(arr[i]>0) {
				map.put(arr[i], i);
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		idx=0;
		answer = new int[list.size()];
		for(int i=list.size()-1;i>=0;i--) {
			answer[idx]=map.get(list.get(i));
			idx++;
		}
        return answer;
    }
}