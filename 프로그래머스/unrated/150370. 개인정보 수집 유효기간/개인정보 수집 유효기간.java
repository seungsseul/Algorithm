import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
       List<Integer> list = new ArrayList<>();
        int t_year = Integer.parseInt(today.substring(0, 4));
		int t_month = Integer.parseInt(today.substring(5, 7));
		int t_day = Integer.parseInt(today.substring(8,10));
		for(int i=0;i<privacies.length;i++) {
        	String tmp = privacies[i];
        	for(int j=0;j<terms.length;j++) {
        		if(tmp.charAt(tmp.length()-1)==terms[j].charAt(0)) {
        			int plus_month = Character.getNumericValue(terms[j].charAt(terms[j].length()-1));
    				if(terms[j].charAt(terms[j].length()-2)!=' ') {
    					plus_month+=10*Character.getNumericValue(terms[j].charAt(terms[j].length()-2));
    					if(terms[j].charAt(terms[j].length()-3)!=' ') {
        					plus_month+=100;
        					
        				}
    				}
        			int plus = 28*plus_month;
        			int year = Integer.parseInt(tmp.substring(0, 4));
        			int month = Integer.parseInt(tmp.substring(5, 7));
        			int day = Integer.parseInt(tmp.substring(8,10));
        			day += plus;
        			month += day/28;
        			day = day%28;
        			year += month/12;
        			month = month%12;
        			day--;
        			if(day<=0) {
        				day=28+day;
        				month--;
        			}
        			if(month<=0) {
        				month=12+month;
        				year--;
        			}
        			if(t_year>year) {
        				list.add(i+1);
        				break;
        			}
        			else if(t_year==year && t_month>month) {
        				list.add(i+1);
        				break;
        			}
        			else if(t_year==year && t_month==month && t_day>day) {
        				list.add(i+1);
        				break;
        			}
        		}
        	}
		}
		int[] answer = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
        return answer;
    }
}