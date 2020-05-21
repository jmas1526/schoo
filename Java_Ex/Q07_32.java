import java.util.Scanner;

class Q07_32 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		//配列の作成
		System.out.print("a(byte)：");
		byte a = keyboardIn.nextByte();
		System.out.print("b(short)：");
		short b = keyboardIn.nextShort();
		System.out.print("c(int)：");
		int c = keyboardIn.nextInt();
		System.out.print("d(long)");
		long d = keyboardIn.nextLong();
		
		printBits(a);
		System.out.println();
		printBits(b);
		System.out.println();
		printBits(c);
		System.out.println();
		printBits(d);
		System.out.println();
	}
	
	
	public static void printBits(byte x){
		for (int i = 7; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	
	public static void printBits(short x){
		for (int i = 15; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	
	public static void printBits(int x){
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
	
	public static void printBits(long x){
		for (int i = 63; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1 ) ? '1' : '0');
	}
}
