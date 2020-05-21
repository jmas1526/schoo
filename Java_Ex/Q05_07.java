class Q05_07 {
	public static void main(String[] args){
		System.out.println("    x\t\t    x^2");
		System.out.println("------------------------");
		for(int i = 0; i <= 1000; i++) {
			float x = (float)i / 1000;
			float y = x * x;
			System.out.printf("%.7f\t%.7f\n", x, y);
		}
	}
}
