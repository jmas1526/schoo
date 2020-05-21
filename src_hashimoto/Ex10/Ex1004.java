
public class Ex1004 {

	public static void main(String[] args) {

		Day d1 = new Day();
		Day d2 = new Day(1997);
		Day d3 = new Day(2010, 13);
		Day d4 = new Day(2000, 2, 31);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		d1.setMonth(15);
		d2.setDate(0);
		d3.set(1997, 12, 15);
		d4.setYear(2001);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		System.out.println("経過日数：" + d1.getElpDays() + "日（残り：" + d1.getMoreDays() + "日）");
		System.out.println("経過日数：" + d2.getElpDays() + "日（残り：" + d2.getMoreDays() + "日）");
		System.out.println("経過日数：" + d3.getElpDays() + "日（残り：" + d3.getMoreDays() + "日）");
		System.out.println("経過日数：" + d4.getElpDays() + "日（残り：" + d4.getMoreDays() + "日）");

	}
}