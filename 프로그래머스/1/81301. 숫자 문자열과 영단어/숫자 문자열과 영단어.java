class Solution {
    public int solution(String s) {
        String answer = "";
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case 'z':
                    answer += "0";
                    i += 3;
                    break;
                case 'o':
                    answer += "1";
                    i += 2;
                    break;
                case 't':
                    if(s.charAt(i+1)=='w') {
                        answer += "2";
                        i += 2;
                    }
                    else {
                        answer += "3";
                        i += 4;
                    }
                    break;
                case 'f':
                    answer += s.charAt(i+1)=='o' ? "4" : "5";
                    i += 3;
                    break;
                case 's':
                    if(s.charAt(i+1)=='i') {
                        answer += "6";
                        i += 2;
                    }
                    else {
                        answer += "7";
                        i += 4;
                    }
                    break;
                case 'e':
                    answer += "8";
                    i += 4;
                    break;
                case 'n':
                    answer += "9";
                    i += 3;
                    break;
                default:
                    answer += String.valueOf(s.charAt(i));
                    break;
            }
        }
        return Integer.parseInt(answer);
    }
}