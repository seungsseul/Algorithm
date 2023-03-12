class Solution {
    public int solution(int number, int limit, int power) {
        int ans=0;
    	int[] arr = new int[number];
    	for(int i=0;i<number;i++) {
    		int yaksu=i+1;
    		for(int j=1;j*j<=yaksu;j++) {    			
    			if(j*j==yaksu) {
    				arr[i]++;
    			}
    			else if(yaksu%j==0) {			
    				arr[i]+=2;
    			}
    		}
    	}
    	for(int i=0;i<number;i++) {
    		if(limit<arr[i]) {
    			arr[i]=power;
    		}
    		ans+=arr[i];
    	}
    	return ans;
    }
}