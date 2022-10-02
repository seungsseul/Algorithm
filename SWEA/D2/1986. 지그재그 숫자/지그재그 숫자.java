import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      
      for(int t = 1; t <= T; t++) {
         
         int N = sc.nextInt();
         int sum = 0;
         for(int n = 1; n <= N; n++) {
            if(n % 2 == 0) {
               sum-=n;
            }
            else {            	
            	sum += n;
            }
         }
         System.out.println("#"+t+" "+sum);
      }
      sc.close();
   }
}
