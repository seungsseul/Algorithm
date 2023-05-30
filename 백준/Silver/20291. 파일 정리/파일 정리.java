import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String Input, tmp;
    static String[] arr;
    static List<String> list;
    static HashMap<String, Integer> map;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<String>();
        map = new HashMap<String, Integer>();
        for(int t=1;t<=N;t++) {
        	Input = br.readLine();
        	String[] arr = Input.split("[.]");
        	tmp = arr[1];
        	if(map.get(tmp)!=null) {
        		map.put(tmp, map.get(tmp)+1);
        	}
        	else {
        		map.put(tmp, 1);
        	}
        }
        list.addAll(map.keySet());
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
        	sb.append(list.get(i)).append(" ").append(map.get(list.get(i))).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();bw.close();br.close();
    }
}
