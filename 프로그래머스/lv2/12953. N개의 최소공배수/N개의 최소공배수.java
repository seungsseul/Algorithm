import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
       //작은 수부터 정렬
		Arrays.sort(arr);
		//배열의 마지막수가 초기값
		int answer=arr[arr.length-1];
		//배열의 마지막수(가장큰수)를 배수하면서 앞의 수들의 배수가 맞는지 판별
		loop:
		while(true) {
			//나머지 배열 수들이 현재의 최소공배수의 배수인지 판별 -> 나눴을때ㅔ 나머지가 0이면 됨
			for(int i=0;i<arr.length-1;i++) {
				//나눴을때 0이 아니면 해당 수는 최소공배수가 아니란 소리이므로 break
				if(answer%arr[i]!=0) {
					break;
				}
				//마지막수까지 탐색했는데 해당 수로 다 나눠지면 최소공배수라는 것이므로 answer출력
				if(i==arr.length-2 && answer%arr[i]==0) {
					break loop;
				}
			}
			//배수 늘려주기
			answer+=arr[arr.length-1];
		}
        return answer;
    }
}