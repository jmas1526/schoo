
public class Q09_3 {

	public static void main(String[] args) {
		Day today = new Day();
		Account ac = new Account("name", "num", 10000, today);
		System.out.println(ac.getOpenDay());
	}

}
