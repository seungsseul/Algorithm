class Solution {
    public String solution(int a, int b) {
        String answer = "";
		//요일배열
		String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		//2016년에 각 월당 1일에 해당하는 요일이 담긴 배열
		String[] month = {"FRI","MON","TUE","FRI","SUN","WED","FRI","MON","THU","SAT","TUE","THU"};
		//해당 월(인덱스)에 해당하는 요일이
		int idx=a-1;
		//요일배열과 맞는 값이 있으면 해당 위치(i)를 인덱스(시작점)로 최신화
		for(int i=0;i<arr.length;i++) {
			if(month[idx].equals(arr[i])) {
				idx=i;
				break;
			}
		}

		//해당 월 해당일(b)에 대한 요일값을 요일배열을 돌면서 찾기 (b일때 멈춘 위치가 해당 요일값)
		for(int i=1;i<b;i++) {
			idx++;
			if(idx==7) {
				idx=0;
			}
		}
		//그렇게 추출한 인덱스가 최종 값이된다
		answer=arr[idx];
        return answer;
    }
}