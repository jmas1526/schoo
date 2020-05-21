class Q05_06 {
	public static void main(String[] args){
		System.out.println("  float\t\t  int");
		System.out.println("------------------------");
		float x = 0;
		for(int i = 0; i <= 1000; i++) {
			float y = (float)i / 1000;
			System.out.printf("%.7f\t%.7f\n", x, y);
			x += 0.001f;
		}
	}
}
