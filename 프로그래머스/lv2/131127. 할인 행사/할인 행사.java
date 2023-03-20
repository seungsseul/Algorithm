import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
    	List<String> list = new ArrayList<>();
        //리스트에 모든 구매물품 다 담기
    	for(int i=0;i<want.length;i++) {
    		for(int j=0;j<number[i];j++) {
    			list.add(want[i]);
    		}
    	}
    	int idx=0;
        //discount배열 10개 탐색을 할 수 있을 때까지
    	for(int i=0;i<=discount.length-10;i++) {
            //tmp리스트 하나 만들어서 discount배열 해당 구간의 10개 요소 넣기
    		List<String> tmp = new ArrayList<>();
    		for(int j=i;j<(i+10);j++) {
    			tmp.add(discount[j]);
    		}
            //기존 리스트 구매물품이 tmp리스트(행사상품리스트)에 있는지 확인하고 있으면 지우기
    		for(int j=0;j<list.size();j++){
                tmp.remove(list.get(j));
            }
            //행사상품리스트가 다 비워졌다면(= 내 구매물품들이 전부 행사날에 포함된다면)
    		if(tmp.isEmpty()) {
                //카운트 세기
    			answer++;
    		}
    	}
        return answer;
    }
}
