import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, month, year, cnt;
	static LocalDate date;
	static DayOfWeek day;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		month=0;
		year=2019;
		for(int i=1;i<=((N-2019)+1)*12;i++) {
			month++;
			if(month==13) {
				year++;
				month=1;
			}
			date = LocalDate.of(year, month, 13);
			day = date.getDayOfWeek();
			if(day.getValue()==5) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();bw.close();br.close();
	}
}
