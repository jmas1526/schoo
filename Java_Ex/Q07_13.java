import java.util.Scanner;

class Q07_13 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("整数：");
		int x = keyboardIn.nextInt();
		printBits(x,32);
		System.out.println();
		
		System.out.print("何ビット目を変更する？：");
		int n = keyboardIn.nextInt();
		
		
		System.out.println("set結果");
		printBits(set(x,n),32);
		System.out.println();
		
		System.out.println("reset結果");
		printBits(reset(x,n),32);
		System.out.println();
		
		System.out.println("inverse結果");
		printBits(inverse(x,n),32);
		System.out.println();
	}
	
	public static int set(int x, int pos) {
		x = x | pow(2,pos); //...00100...との論理和
		return x;
	}
	
	public static int reset(int x, int pos) {
		x = x & -(pow(2,pos) + 1); //...11011...との論理積
		return x;
	}
	
	public static int inverse(int x, int pos) {
		x = x ^ pow(2,pos); //...00100...との排他的論理和
		return x;
	}
	
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
