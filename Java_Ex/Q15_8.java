public class Q15_8 {

	public static void main(String[] args) {
		if(args.length == 0) {
			Calendar.printCalender();
		}else if(args.length == 1) {			
			Calendar.printCalender(Integer.parseInt(args[0]));
		}else {
			Calendar.printCalender(Integer.parseInt(args[0]),Integer.parseInt(args[1]));			
		}
	}
}


class Calendar{
	//1ヵ月のカレンダーを表示
	static void printCalender(int year, int month){
		System.out.println("===========================");
		System.out.println("        " + year + "年" + month + "月");
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int startDayOfWeek = dayOfWeek(year,month,1);
		int dayOfWeekCount = startDayOfWeek;
		for (int i = 0; i < startDayOfWeek; i++) {
			System.out.print("    ");			
		}
		System.out.printf("%3d ",1);
		for(int i = 2; i <= Day.dayOfMonth(year, month); i++, dayOfWeekCount++) {
			if(dayOfWeekCount == 6) {
				System.out.println();
				dayOfWeekCount = -1;
			}
			System.out.printf("%3d ",i);
		}
		System.out.println("\n");
	}
	
	//1年のカレンダーを表示
	static void printCalender(int year) {
		for (int m = 1; m <= 12; m++) {
			printCalender(year,m);
		}
	}
	
	static void printCalender() {
		Day today = new Day();
		printCalender(today.getYear(),today.getMonth());
	}
	
	//曜日 sun:0 sat:6
	static int dayOfWeek(int y, int m, int d){
		Day day = new Day(y,m,d);
		return day.dayOfWeek();
	}
}
