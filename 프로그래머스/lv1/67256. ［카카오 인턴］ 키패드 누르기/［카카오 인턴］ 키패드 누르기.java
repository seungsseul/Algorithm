class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
		String answer = "";
		int left=10; //*
		int right=12; //#
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				numbers[i]=11;
			}
			if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==11) {
				int lcnt=0;
				int rcnt=0;
				int ltmp=left;
				int rtmp=right;
				if(ltmp%3==1) {
					lcnt++;
					ltmp++;
				}
				if(rtmp%3==0) {
					rcnt++;
					rtmp--;
				}
				lcnt+=(Math.abs(numbers[i]-ltmp)/3);
				rcnt+=(Math.abs(numbers[i]-rtmp)/3);
				if(lcnt==rcnt) {
					if(hand.equals("left")) {
						sb.append("L");
						left=numbers[i];
					}
					else {
						sb.append("R");
						right=numbers[i];
					}
					System.out.println(111);
				}
				else if(lcnt>rcnt) {
					sb.append("R");
					right=numbers[i];
					System.out.println(222);
				}
				else {
					sb.append("L");
					left=numbers[i];
					System.out.println(333);
				}
			}
			else if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
				sb.append("L");
				left=numbers[i];
				System.out.println(456);
			}
			else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				sb.append("R");
				right=numbers[i];
				System.out.println(789);
			}
		}
		answer = sb.toString();
        return answer;
    }
}