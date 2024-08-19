import java.util.Map;
import java.util.HashMap;
class Solution {
    static String answer;
    static String[] morse;
    static Map<String, String> m;
    public String solution(String letter) {
        m = new HashMap<>();
        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");m.put(".","e");m.put("..-.","f");m.put("--.","g");m.put("....","h");m.put("..","i");m.put(".---","j");m.put("-.-","k");m.put(".-..","l");m.put("--","m");m.put("-.","n");m.put("---","o");m.put(".--.","p");m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");m.put("-.--","y");m.put("--..","z");
        morse = letter.split(" ");
        String answer = "";
        for(String mos : morse) {
            answer += m.get(mos);
        }
        return answer;
    }
}