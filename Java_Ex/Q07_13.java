import java.util.Scanner;

class Q07_13 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("�����F");
		int x = keyboardIn.nextInt();
		printBits(x,32);
		System.out.println();
		
		System.out.print("���r�b�g�ڂ�ύX����H�F");
		int n = keyboardIn.nextInt();
		
		
		System.out.println("set����");
		printBits(set(x,n),32);
		System.out.println();
		
		System.out.println("reset����");
		printBits(reset(x,n),32);
		System.out.println();
		
		System.out.println("inverse����");
		printBits(inverse(x,n),32);
		System.out.println();
	}
	
	public static int set(int x, int pos) {
		x = x | pow(2,pos); //...00100...�Ƃ̘_���a
		return x;
	}
	
	public static int reset(int x, int pos) {
		x = x & -(pow(2,pos) + 1); //...11011...�Ƃ̘_����
		return x;
	}
	
	public static int inverse(int x, int pos) {
		x = x ^ pow(2,pos); //...00100...�Ƃ̔r���I�_���a
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
