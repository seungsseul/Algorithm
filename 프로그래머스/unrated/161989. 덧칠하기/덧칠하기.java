class Solution {
    public int solution(int n, int m, int[] section) {
        int ans=0;
		int[] arr = new int[n];
		//페인트를 다시칠해야 하는 구역 1로 표기
		for(int i=0;i<section.length;i++) {
			arr[section[i]-1]++;
		}
		//페인트를 칠할 구역을 찾으면 롤러의 길이만큼 탐색해서 해당 영역에 페인트를 칠해야 하는 구역이 있으면 칠해주기
		loop:
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				ans++;
				for(int j=i;j<i+m;j++) {
					if(j==n) {
						break loop;
					}
					if(arr[j]==1) {						
						arr[j]=0;
					}
				}
			}
		}
		return ans;
    }
}