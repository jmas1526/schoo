public class prac_2_1 {
	public static void main(String[] args) {
	
		int x;
		int y;

		x = 63.4;
		y = 18.7;

		System.out.println("xの値は"+ x +"です");
		System.out.println("yの値は"+ y +"です");
		System.out.println("合計は"+ (x+y) +"です");
		System.out.println("平均は"+ (x+y)/2 +"です");

	}
}

//考察：小数点以下が切り捨てられ、結果は変わらない。またはエラー。