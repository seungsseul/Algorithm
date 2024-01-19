class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.replaceAll("\\s", "").split("\\+");
        int x = 0;
        int num = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].contains("x")) {
                if(arr[i].equals("x")) {
                    x+=1;
                    continue;
                }
                x+=Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
            }
            else {
                num+=Integer.parseInt(arr[i]);
            }
        }
        if(x==0) {
            answer=String.valueOf(num);
            return answer;
        }
        if(num==0) {
            answer = x==1 ? "x" : String.valueOf(x)+"x";
            return answer;
        }
        answer = x==1 ? "x + "+String.valueOf(num) : String.valueOf(x)+"x + "+String.valueOf(num);
        return answer;
    }
}