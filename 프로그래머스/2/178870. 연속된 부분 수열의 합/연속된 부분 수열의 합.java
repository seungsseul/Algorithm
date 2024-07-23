class Solution {
    static int start, end, min;
    static long sum;
    static int[] answer;
    public int[] solution(int[] sequence, int k) {
        start = 0; end = 0; sum = sequence[0]; min = Integer.MAX_VALUE;
        answer = new int[2];
        while(start<=end) {
            //길이가 하나인 부분수열일 경우 제일 작은 것이므로 answer배열에 세팅하고 break
            if(sum==k && start==end) {
                answer[0]=start;
                answer[1]=end;
                break;
            }
            //배열의 인덱스 범위를 초과할 경우 break
            if(start==sequence.length || end==sequence.length) {
                break;
            }
            //k보다 작을 경우
            if(sum<k && end+1!=sequence.length) {
                end++;
                sum+=sequence[end];
            }
            //k와 같은 경우
            else if(sum==k && start+1!=sequence.length) {
                //최소길이의 부분 수열일때만 answer배열에 세팅
                if(end-start<min) {
                    min = end-start;
                    answer[0]=start;
                    answer[1]=end;
                }
                sum-=sequence[start];
                start++;
            }
            //k보다 클 경우
            else {
                sum-=sequence[start];
                start++;
            }
        }
        return answer;
    }
}