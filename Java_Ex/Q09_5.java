
public class Q09_5 {

	public static void main(String[] args) {
		Day from = new Day();
		Day to = new Day(2022);
		Period period = new Period(from, to);
		System.out.println("期間：" + period);
		Day to2 = new Day(from);
		to2.nextNDay(200);
		period.changeDay(true, to2);
		System.out.println("期間：" + period);
		period.addToOneMonth();
		System.out.println("期間：" + period);
	}

}
