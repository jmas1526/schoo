
public class Q15_7 {

	public static void main(String[] args) {
		double sum = 0d;
		for(String s : args) {
			sum += Double.parseDouble(s);
		}
		System.out.println("合計は" + sum + "です。");

	}

}
