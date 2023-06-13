class Solution {
    public int solution(int[][] dots) {
        int answer=0;
        for(int i=0; i<dots.length;i++) {
            double tmp=cacul(dots[i],dots[(i+1)%4]);
            double tmp2=cacul(dots[(i+2)%4],dots[(i+3)%4]);

            if(tmp==tmp2) {
                answer=1;
                return answer;
            }
        }
        return answer;
    }
    
    public static double cacul(int[]arr1,int[]arr2) {
        double down, up;

        down=arr1[0]-arr2[0];
        up=arr1[1]-arr2[1];

        return up/down;
    }
}