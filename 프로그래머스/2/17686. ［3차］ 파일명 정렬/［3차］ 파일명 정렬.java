import java.util.Arrays;
import java.util.Comparator;
class Solution {
    static String o1_head, o2_head, o1_number, o2_number, o1_tail, o2_tail;
    static String[] answer;
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        for(int i=0;i<files.length;i++) {
            answer[i]=files[i];
        }
        Arrays.sort(answer, new Comparator<>(){
            @Override
            public int compare(String o1, String o2) {
                divideStr(o1, o2);
                //head비교
                if(o1_head.compareToIgnoreCase(o2_head)!=0) {
                    return o1_head.compareToIgnoreCase(o2_head);
                } 
                //number비교
                if(Integer.parseInt(o1_number)!=Integer.parseInt(o2_number)) {
                    return Integer.parseInt(o1_number)-Integer.parseInt(o2_number);
                }
                //tail비교
                return 0;
            }
        });
        return answer;
    }
    static void divideStr(String o1, String o2) {
        o1_head = setHead(o1, "");
        o1_number = setNumber(o1, "");
        o1_tail = o1.substring(o1_head.length()+o1_number.length());
        o2_head = setHead(o2, "");
        o2_number = setNumber(o2, "");
        o2_tail = o2.substring(o2_head.length()+o2_number.length());
        return;
    }
    static String setHead(String str, String head) {
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>=48 && str.charAt(i)<=57) {
                break;
            }
            head+=String.valueOf(str.charAt(i));
        }
        return head;
    }
    static String setNumber(String str, String number) {
        for(int i=o1_head.length();i<str.length();i++) {
            if(str.charAt(i)<48 || str.charAt(i)>57) {
                break;
            }
            number+=String.valueOf(str.charAt(i));
        }
        return number;
    }
}