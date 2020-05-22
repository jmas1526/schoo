//メソッド確認用

class Exercise10_4{
	public static void main(String[]args) {
		
		Day today = new Day();
		System.out.println(today.toString());
		
		Day day1 = new Day(2020,0,0);
		System.out.println(day1.toString());
		
		System.out.println(today.elapsedDays());
		
		System.out.println(today.daysLeft());
		
		today.contextWithOtherDates();
		
		Day.classContextWithOtherDates();
		
		today.moveForwardOneDay();
		System.out.println(today.toString());
		
		today.getMoveForwardOneDay();
		
		today.goBackOneDay();
		System.out.println(today.toString());
		
		today.getGoBackOneDay();
		
		today.moveForwardDays();
		System.out.println(today.toString());
		
		today.getMoveForwardDays();
		
		today.goBackDays();
		System.out.println(today.toString());
		
		today.getGoBackDays();
	}
}