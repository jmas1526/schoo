import java.util.Scanner;

class Q2_6 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("�O�p�`�̖ʐς����߂܂��B\n");
		System.out.print("��ӁF");
		double x = keyboardIn.nextDouble();
		System.out.print("�����F");
		double y = keyboardIn.nextDouble();
		System.out.println("�ʐς�"+ (x * y / 2) + "�ł��B");
	}
}