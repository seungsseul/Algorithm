class Solution {
    public int solution(int chicken) {
        int service = chicken/10;
        int tmp = chicken%10;
        int service2 = service+tmp;
        while(true) {
            if(service2<10) {
                break;
            }
            System.out.println(service2);
            service+=service2/10;
            tmp=service2%10;
            service2=service2/10+tmp;
        }
        return service;
    }
}