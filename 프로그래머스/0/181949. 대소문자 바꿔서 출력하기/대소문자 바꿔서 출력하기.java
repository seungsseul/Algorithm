import java.util.Scanner;

public class Solution {
    static String a, upper, lower, answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        upper = a.toUpperCase();
        lower = a.toLowerCase();
        answer = "";
        for(int i=0;i<a.length();i++) {
            answer += a.charAt(i)==upper.charAt(i) ? String.valueOf(lower.charAt(i)) : String.valueOf(upper.charAt(i));
        }
        System.out.println(answer);
    }
}