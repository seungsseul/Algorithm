import java.io.*;
import java.util.*;
class Solution {
    public String solution(String s) {
        //문자열 잘라서 배열에 넣기
        String[] arr = s.split(" ");
        //똑같은 크기의 int배열 생성
		int[] ans = new int[arr.length];
        //String배열값 int로 바꿔서 int배열에 복사
		for(int i=0;i<arr.length;i++) {
			ans[i]=Integer.parseInt(arr[i]);
		}
        //값 정렬
		Arrays.sort(ans);
        //"(최소값) (최대값)"형태로 값 출력
        StringBuilder sb = new StringBuilder();
        sb.append(ans[0]).append(" ").append(ans[ans.length-1]);      
        return sb.toString();
    }
}