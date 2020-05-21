class Q2_1 {
	public static void main(String[] args){
		int x;
		int y;
		
		x = 63;
		y = 18;
		
		/*演習用のエラー代入
		x = 63.1;
		y = 18.9;
		
		型に合わない代入を行うと、自動では変換されず弾かれてしまう。
		*/
		
		System.out.println("xの値は" + x + "です");
		System.out.println("yの値は" + y + "です");
		System.out.println("合計は" + (x + y) + "です");
		System.out.println("平均は" + (x + y) / 2 + "です");
	}
}