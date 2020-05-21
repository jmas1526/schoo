
public class Q15_6 {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		System.out.println("‰~üF" + circumference(r));
		System.out.println("–ÊÏF" + circleArea(r));
	}
	
	public static double circumference(double r) {
		return 2 * r * Math.PI;
	}
	public static double circleArea(double r) {
				return r * r * Math.PI;
	}

}
