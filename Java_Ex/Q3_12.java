import java.util.Scanner;

class Q3_12 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = keyboardIn.nextInt();
		System.out.print("����B�F");
		int b = keyboardIn.nextInt();
		System.out.print("����C�F");
		int c = keyboardIn.nextInt();
		
		int min = a;
		min = min < b ? min : b;
		min = min < c ? min : c;
		
		System.out.println("�ŏ��l�F" + min);
	}
}