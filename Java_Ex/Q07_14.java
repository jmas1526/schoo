import java.util.Scanner;

class Q07_14 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("整数：");
		int x = keyboardIn.nextInt();
		printBits(x,32);
		System.out.println();
		
		System.out.print("最下位ビット：");
		int pos = keyboardIn.nextInt();
		
		System.out.print("個数：");
		int n = keyboardIn.nextInt();
		
		
		System.out.println("setN結果");
		printBits(setN(x,pos,n),32);
		System.out.println();
		
		System.out.println("resetN結果");
		printBits(resetN(x,pos,n),32);
		System.out.println();
		
		System.out.println("inverseN結果");
		printBits(inverseN(x,pos,n),32);
		System.out.println();
	}
	
	public static int set(int x, int pos) {
		//...0001000...との論理和
		x = x | pow(2,pos);
		return x;
	}
	
	public static int setN(int x, int pos, int n) {
		int max = pos + n;
		for(;pos < max; pos++) {
			x = set(x, pos);
		}
		return x;
	}
	
	
	public static int reset(int x, int pos) {
		//...111101111...との論理積
		x = x & -(pow(2,pos) + 1);
		return x;
	}
	
	public static int resetN(int x, int pos, int n) {
		int max = pos + n;
		for(;pos < max; pos++) {
			x = reset(x, pos);
		}
		return x;
	}
	
	
	public static int inverse(int x, int pos) {
		//...000010000...との排他的
		x = x ^ pow(2,pos);
		return x;
	}
	
	public static int inverseN(int x, int pos, int n) {
		int max = pos + n;
		for(;pos < max; pos++) {
			x = inverse(x, pos);
		}
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
