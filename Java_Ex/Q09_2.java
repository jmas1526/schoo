
public class Q09_2 {

	public static void main(String[] args) {
		Day day1 = new Day();
		Day day2 = new Day(2222);
		Day day3 = new Day(2222,3);
		Day day4 = new Day(2222,3,3);
		Day day5 = new Day(day1);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
	}

}
