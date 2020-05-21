import java.util.Scanner;

class Q07_12 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("整数：");
		int x = keyboardIn.nextInt();
		printBits(x,32);
		System.out.println();
		
		System.out.print("回転ビット数：");
		int n = keyboardIn.nextInt();
		
		
		System.out.println("R結果");
		printBits(rRotate(x,n),32);
		System.out.println();
		
		System.out.println("L結果");
		printBits(lRotate(x,n),32);
		System.out.println();
	}
	
	public static int rRotate(int x, int n) {
		for (int i = n ; i > 0; i--){
			boolean least1 = false; //最下位ビットが1ならtrue
			if((x & 1) == 1) least1 = true;
			x = x >>> 1;
			if(least1) x = x | -pow(2,31); //1000...との論理和
		}
		return x;
	}
	
	
	public static int lRotate(int x, int n) {
		for (int i = n ; i > 0; i--){
			boolean most1 = false; //最上位ビットが1ならtrue
			if(x < 0) most1 = true;
			x = x << 1;
			if(most1) x = x | 1; //...0001との論理和
		}
		return x;
	}}
	
	
	public static void printBits(int x, int n) {
		for (int i = n - 1; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	public static int pow(int n, int e) {
		int tmp = 1;
		for (; e > 0; e--){
			tmp *= n;
		}
		return tmp;
	}
		
}
