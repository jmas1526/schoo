import java.util.Scanner;

class Q3_10 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = keyboardIn.nextInt();
		System.out.print("����b�F");
		int b = keyboardIn.nextInt();
		
		System.out.println("����" + (a >= b ? a - b : b - a) + "�ł��B");
	}
}