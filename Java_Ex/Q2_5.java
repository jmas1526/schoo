import java.util.Scanner;

class Q2_5 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("x�̒l�F");
		double x = keyboardIn.nextDouble();
		System.out.print("y�̒l�F");
		double y = keyboardIn.nextDouble();
		System.out.println("���v��"+ (x + y) + "�ł��B");
		System.out.println("���ς�"+ (x + y) / 2 + "�ł��B");
	}
}