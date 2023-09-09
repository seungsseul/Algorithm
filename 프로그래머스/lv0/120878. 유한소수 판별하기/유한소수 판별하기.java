class Solution {
    public int solution(int a, int b) {
        int min=Math.min(a,b);
        //최대공약수로 약분하는 알고리즘
        for(int i=min;i>=2;i--) {
            if(a%i==0 && b%i==0) {
                a/=i;
                b/=i;
                break;
            }
        }
        //정수도 유한소수
        if(a%b==0) {
            return 1;
        }
        //소수 2,3,5,7 중 3,7이 소인수라면 무한소수
        if(b%3==0 || b%7==0) {
            return 2;
        }
        //2와 5 제외하고 소수가 더 있는지 구하는 알고리즘
        for(int i=11;i<=b;i++) {
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
                continue;
            }
            if(b%i==0) {
                return 2;
            }
        } 
        return 1;
    }
}