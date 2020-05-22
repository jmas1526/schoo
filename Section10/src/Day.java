import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
import java.util.Scanner;

class Day{
	
	static Scanner stdIn=new Scanner(System.in);
	
	private int year = 1;
	private int month =1;
	private int date =1;
	
	public static boolean isLeap(int y) {
		return y%4 == 0 && y%100 !=0 || y%400 ==0;
	}
	
	public int dateMax(int month) {
		int dateMax=0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
				dateMax=31;
				break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			dateMax=30;
			break;
		}
		case 2:
			if(isLeap(year)==true) {
				dateMax=29;
				break;
			}else{
				dateMax=28;
				break;
			}
		default:{
			if(month>12) {
				dateMax=31;
				break;
			}else if(month<1) {
				dateMax=31;
				break;
			}
		}
		}
		return dateMax;
	}
	
	//constructor
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(YEAR);
		this.month = today.get(MONTH) + 1;
		this.date = today.get(DATE);
	}
	
	public Day(int year) {
		this.year = year;
	}
	
	public Day(int year,int month) {
		this(year);
		if(month>12) month=12;
		if(month<1)  month=1;
		this.month=month;
	}
	
	public Day(int year,int month,int date) {
		this(year,month);
		if(dateMax(month)<date) {
			date=dateMax(month);
		}else if(date<1) {
			date=1;
		}
		this.date=date;
	}
		
		
	public Day(Day d) {
		this(d.year,d.month,d.date);
	}
	
	
	//class method
	
	//contextWithOtherDates
	public static void classContextWithOtherDates() {
		System.out.println("日付を入力してください。");
		System.out.print("year1:"); 
		int year1 = stdIn.nextInt();
		System.out.print("month1:"); 
		int month1 = stdIn.nextInt();
		System.out.print("date1:"); 
		int date1 = stdIn.nextInt();
		
		System.out.println("日付を入力してください。");
		System.out.print("year2:"); 
		int year2 = stdIn.nextInt();
		System.out.print("month2:"); 
		int month2 = stdIn.nextInt();
		System.out.print("date2:"); 
		int date2 = stdIn.nextInt();
		
		boolean classContextWithOtherDates=true;
		if(year1<year2) {
			classContextWithOtherDates=true;
		}else if(year1>year2) {
			classContextWithOtherDates=false;
		}
		if(month1<month2) {
			classContextWithOtherDates=true;
		}else if(month1>month2) {
			classContextWithOtherDates=false;
		}
		if(date1<date2) {
			classContextWithOtherDates=true;
		}else if(date1>date2) {
			classContextWithOtherDates=false;
		}
		
		if(classContextWithOtherDates==true) {
			System.out.printf("%04d年%02d月%02d日の方が前です。",year1,month1,date1);
		}else {
			System.out.printf("%04d年%02d月%02d日のほうが前です。",year2,month2,date2);
		}
	}
	
	//get
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return date;}
	
	//set
	public void setYear(int year)   {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDate(int date)   {this.date = date;}
	
	public void set(int year,int month,int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}
	
	public boolean isLeap() {return isLeap(year);}
	
	public int dayOfWeek() {
		int y=year;
		int m=month;
		if(m==1 || m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m+8)/5+date) % 7;
	}
	
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	public String toString() {
		String[] wd = {"日","月","火","水","木","金","土"};
		return String.format("%04d年%02d月%02d日（%s）", year,month,date,wd[dayOfWeek()]);
	}
	
	//elapsedDays
	public int elapsedDays() {
		int elapsedDays=0;
		for(int i=1;i<month;i++) {
			elapsedDays += dateMax(i);
		}
		elapsedDays += date;
		return elapsedDays;
	}
			
	//daysLeft
	public int daysLeft() {
		int daysLeft=dateMax(month)-date;
		for(int i=(month+1);i<=12;i++) {
			daysLeft += dateMax(i);
		}
		return daysLeft;
	}
	
	
	
	//contextWithOtherDates
	public void contextWithOtherDates() {
		System.out.println("日付を入力してください。");
		System.out.print("year:"); 
		int yearTarget = stdIn.nextInt();
		System.out.print("month:"); 
		int monthTarget = stdIn.nextInt();
		System.out.print("date:"); 
		int dateTarget = stdIn.nextInt();
		
		boolean contextWithOtherDates=true;
		if(year<yearTarget) {
			contextWithOtherDates=true;
		}else if(year>yearTarget) {
			contextWithOtherDates=false;
		}
		if(month<monthTarget) {
			contextWithOtherDates=true;
		}else if(month>monthTarget) {
			contextWithOtherDates=false;
		}
		if(date<dateTarget) {
			contextWithOtherDates=true;
		}else if(date>dateTarget) {
			contextWithOtherDates=false;
		}
		
		if(contextWithOtherDates==true) {
			System.out.printf("%04d年%02d月%02d日の方が前です。",year,month,date);
		}else {
			System.out.printf("%04d年%02d月%02d日のほうが前です。",yearTarget,monthTarget,dateTarget);
		}
	}
	
	//moveForwardOneDay
	public void moveForwardOneDay() {
		if(date == dateMax(month)) {
			if(month == 12) {
				year++;
				month=1;
				date=1;
			}else{
				month++;
				date=1;
			}
		}else {
			date++;
		}
	}
	
	//getMoveForwardOneDay
	public void getMoveForwardOneDay() {
		moveForwardOneDay();
		System.out.println(toString());
	}
	
	//goBackOneDay
		public void goBackOneDay() {
			if(date == 1) {
				if(month == 1) {
					year--;
					month=12;
					date=31;
				}else{
					month--;
					date=31;
				}
			}else {
				date--;
			}
		}
		
		//getGoBackOneDay
		public void getGoBackOneDay() {
			goBackOneDay();
			System.out.println(toString());
			
		}
		
		//moveForwardDays
		public void moveForwardDays() {
			System.out.print("何日進めますか：");
			int n=stdIn.nextInt();
			
			for(int i=0;i<n;i++) {
				if(date > dateMax(month)) {
					if(month==12) {
						year++;
						month=1;
						date=1;
					}else {
						month++;
						date=1;
					}
				}else {
					date++;
				}
			}
		}
		
		//getMoveForwardDays
		public void getMoveForwardDays() {
			moveForwardDays();
			System.out.println(toString());
		}
		
		//goBackDays
			public void goBackDays() {
				System.out.print("何日戻りますか：");
				int n=stdIn.nextInt();
				
				for(int i=0;i<n;i++) {
					if(date == 1) {
						if(month == 1) {
							year--;
							month=12;
							date=31;
						}else{
							month--;
							date=31;
						}
					}else {
						date--;
					}
				}
			}
			
			//getGoBackDays
			public void getGoBackDays() {
				goBackDays();
				System.out.println(toString());
			}
}
