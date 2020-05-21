import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Day {

	private int year;
	private int month;
	private int date;

	//今日の日付
	private static int todayYear;
	private static int todayMonth;
	private static int todayDate;

	//各月の日数（閏年を除く）
	final private static int[] monthlyDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	//今日の日付で初期化
	static {
		GregorianCalendar today = new GregorianCalendar();
		todayYear = today.get(YEAR);
		todayMonth = today.get(MONTH) + 1;
		todayDate = today.get(DATE);
	}

	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	public Day() { this.year = todayYear; this.month = todayMonth; this.date = todayDate; }
	public Day(int year) { this(); this.year = year; clear(); }
	public Day(int year, int month) { this(year); this.month = month; clear(); }
	public Day(int year, int month, int date) { this(year, month); this.date = date; clear();}
	public Day(Day d) { this(d.year, d.month, d.date); }

	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return date; }

	public void setYear(int year) { this.year = year; clear(); }
	public void setMonth(int month) { this.month = month; clear(); }
	public void setDate(int date) { this.date = date; clear(); }

	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		clear();
	}

	public boolean isLeap() { return isLeap(year); }

	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	//正しい値に直すメソッド
	public void clear() {
		if(year < 1) year = 1;
		if(month < 1) month = 1;
		if(month > 12) month = 12;
		if(date < 1) date = 1;
		int maxDate = !isLeap() ? 0 : 1;
		maxDate += monthlyDate[month-1];
		if(date > maxDate) date = maxDate;
	}

	//年内での経過日数を求めるメソッド
	public int getElpDays() {
		int elpDays = 0;
		for (int i = 1; i<month; i++) {
			elpDays += monthlyDate[i-1];
			if (i == 2 && isLeap()) elpDays++;
		}
		elpDays += date-1;
		return elpDays;
	}

	//年内の残り日数を求めるメソッド
	public int getMoreDays() {
		int moreDays = !isLeap() ? 364 : 365;
		moreDays -= getElpDays();
		return moreDays;
	}


}
