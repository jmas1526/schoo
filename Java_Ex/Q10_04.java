import java.util.Scanner;

class Q10_04 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		Day today = new Day();
		System.out.println(today);
		
		Day day1 = new Day(-3);
		System.out.println(day1);
		
		Day day2 = new Day(3000,-1);
		System.out.println(day2);
		
		Day day3 = new Day(2000,2,31);
		System.out.println(day3);
		
		Day day4 = new Day(2100,2,31);
		System.out.println(day4);
		System.out.println(day4.lapDays());
		System.out.println(day4.remDays());
		day4.compare(day3);
		Day.compare(day3,day4);
		
		System.out.println("day4++");
		day4.nextDay();
		System.out.println(day4);
		System.out.println("nextday4");
		System.out.println(Day.nextDay(day4));
		System.out.println("day4+3days");
		day4.nextNDay(3);
		System.out.println(day4);
		System.out.println("next4day4");
		System.out.println(Day.nextNDay(day4,4));
		System.out.println("day4--");
		day4.prevDay();
		System.out.println(day4);
		System.out.println("prevday4");
		System.out.println(Day.prevDay(day4));
		System.out.println("day4-5days");
		day4.prevNDay(5);
		System.out.println(day4);
		System.out.println("prev4day4");
		System.out.println(Day.prevNDay(day4,4));
		
		
	}
	
}
