import java.util.Scanner;

class Q07_12 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("�����F");
		int x = keyboardIn.nextInt();
		printBits(x,32);
		System.out.println();
		
		System.out.print("��]�r�b�g���F");
		int n = keyboardIn.nextInt();
		
		
		System.out.println("R����");
		printBits(rRotate(x,n),32);
		System.out.println();
		
		System.out.println("L����");
		printBits(lRotate(x,n),32);
		System.out.println();
	}
	
	public static int rRotate(int x, int n) {
		for (int i = n ; i > 0; i--){
			boolean least1 = false; //�ŉ��ʃr�b�g��1�Ȃ�true
			if((x & 1) == 1) least1 = true;
			x = x >>> 1;
			if(least1) x = x | -pow(2,31); //1000...�Ƃ̘_���a
		}
		return x;
	}
	
	
	public static int lRotate(int x, int n) {
		for (int i = n ; i > 0; i--){
			boolean most1 = false; //�ŏ�ʃr�b�g��1�Ȃ�true
			if(x < 0) most1 = true;
			x = x << 1;
			if(most1) x = x | 1; //...0001�Ƃ̘_���a
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
