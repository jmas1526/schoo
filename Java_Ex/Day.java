import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day{
	private int year = 1;
	private int month = 1;
	private int date = 1;
	private static final int yearToday;
	private static final int monthToday;
	private static final int dateToday;
	
	static{
		GregorianCalendar today = new GregorianCalendar();
		yearToday = today.get(YEAR);
		monthToday = today.get(MONTH) + 1;
		dateToday = today.get(DATE);
	}
	
	//y年は閏年か
	public static boolean isLeap(int y){
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	//コンストラクタ
	public Day(){
		this(yearToday, monthToday, dateToday);
	}
	public Day(int year){
		if(year < 1) year = 1;
		this.year = year;
	}
	public Day(int year, int month){
		this(year);
		if(month < 1 ) month = 1;
		if(month > 12) month = 12;
		this.month = month;
	}
	public Day(int year, int month, int date){
		this(year, month);
		if(date < 1) date = 1;
		if(date > 28){
			switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(date > 31) date = 31;
				break;
			case 2:
				if(isLeap(year)) date = 29;
				else date = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(date > 30) date = 30;
				break;
			}
		}
		this.date = date;
	}
	public Day(Day d){
		this(d.year, d.month, d.date);
	}
	
	//getter
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return date;
	}
	
	//setter
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDate(int date){
		this.date = date;
	}
	
	public void set(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//インスタンスは閏年か
	public boolean isLeap(){
		//return isLeap(year);
		return isLeap(this.year);
	}
	
	//曜日
	public int dayOfWeek(){
		int y = year;
		int m = month;
		if(m == 1 || m == 2){
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m + 8)/5 + date) % 7;
	}
	
	//日付dと等しいか
	public boolean equalTo(Day d){
		return year == d.year && month == d.month && date == d.date;
	}
	
	//文字列表現を返却
	public String toString(){
		String[] wd = {"日","月","火","水","木","金","土"};
		return String.format("%04d年%02d月%02d日(%s)",
								year, month, date, wd[dayOfWeek()]);
	}
	
	//月ごとの日数を返却
	public static int dayOfMonth(int y,int m){
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
				//break;
			case 2:
				if(isLeap(y)) return 29;
				else return 28;
				//break;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
				//break;
			default:
				System.out.println("入力された月が不正です");
				return 0;
				//break;
			}
	}
	//年内の経過日数M
	public int lapDays(){
		int dayCount = 0;
		for (int m = month - 1; m > 0; m--){
			dayCount += dayOfMonth(year,m);
		}
		dayCount += date - 1;
		return dayCount;
	}
	
	//年内の残り日数M
	public int remDays(){
		int dayCount = dayOfMonth(year,month) - date;
		for (int m = month + 1; m < 13; m++){
			dayCount += dayOfMonth(year,m);
		}
		return dayCount;
	}
	
	//ほかの日付との前後関係の判定IM
	public void compare(Day targetDay){
		int flag = -2; //targetが -1:前, 0:同じ, 1:後
		if (year != targetDay.year){
			flag = year > targetDay.year ? -1 : 1;
		}else{
			if(month != targetDay.month){
				flag = month > targetDay.month ? -1 : 1;
			}else{
				if(date != targetDay.date){
					flag = date > targetDay.date ? -1 : 1;
				}else{
					flag = 0;
				}
			}
		}
		switch(flag){
		case -1:
			System.out.println(targetDay + "は" + toString() + "より前の日付です");
			break;
		case 0:
			System.out.println(targetDay + "は" + toString() + "と同じ日付です");
			break;
		case 1:
			System.out.println(targetDay + "は" + toString() + "は後の日付です");
			break;
		default:
			System.out.println("エラー");
			break;
		}
	}
	//2つの日付の前後関係を判定するCM
		public static void compare(Day day1, Day day2){
		int flag = -2; //targetが -1:前, 0:同じ, 1:後
		if (day1.year != day2.year){
			flag = day1.year > day2.year ? -1 : 1;
		}else{
			if(day1.month != day2.month){
				flag = day1.month > day2.month ? -1 : 1;
			}else{
				if(day1.date != day2.date){
					flag = day1.date > day2.date ? -1 : 1;
				}else{
					flag = 0;
				}
			}
		}
		switch(flag){
		case -1:
			System.out.println(day2 + "は" + day1 + "より前の日付です");
			break;
		case 0:
			System.out.println(day2 + "と" + day1 + "は同じ日付です");
			break;
		case 1:
			System.out.println(day2 + "は" + day1 + "より後の日付です");
			break;
		}
	}
	//日付を1日進めるM
	public void nextDay(){
		date++;
		if(date > dayOfMonth(year, month)){
			date = 1;
			month++;
			if(month > 12) year++;
		}
	}
	//翌日の日付を返却するM
	public static  Day nextDay(Day day){
		int y = day.year;
		int m = day.month;
		int d = day.date;
		d++;
		if(d > dayOfMonth(y, m)){
			d = 1;
			m++;
			if(m > 12){
				y++;
				m = 1;
			}
		}
		return new Day(y,m,d);
	}
	//日付を1日戻すM
	public void prevDay(){
		date--;
		if(date < 1){
			month--;
			if(month < 1){
				month = 12;
				year--;
			}
			date = dayOfMonth(year,month);
		}
	}
	//前日の日付を返却するM
	public static Day prevDay(Day day){
		int y = day.year;
		int m = day.month;
		int d = day.date;
		d--;
		if(d < 1){
			m--;
			if(m < 1){
				m = 12;
				y--;
			}
			d = dayOfMonth(y,m);
		}
		return new Day(y,m,d);
	}
	//日付をn日進めるM
	public void nextNDay(int n){
		for (; n > 0; n--){
			nextDay();
		}
	}
	//n日後の日付を返却するM
	public static Day nextNDay(Day day, int n){
		int y = day.year;
		int m = day.month;
		int d = day.date;
		for (; n > 0; n--){
			d++;
			if(d > dayOfMonth(y, m)){
				d = 1;
				m++;
				if(m > 12){
					y++;
					m = 1;
				}
			}
		}
		return new Day(y,m,d);
	}
	//日付をn日戻すM
	public void prevNDay(int n){
		for (; n > 0; n--){
			prevDay();
		}
	}
	//n日前の日付を返却するM
	public static Day prevNDay(Day day, int n){
		int y = day.year;
		int m = day.month;
		int d = day.date;
		for (; n > 0; n--){
			d--;
			if(d < 1){
				m--;
				if(m < 1){
					m = 12;
					y--;
				}
				d = dayOfMonth(y,m);
			}
		}
		return new Day(y,m,d);
	}
}
