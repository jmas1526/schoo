import java.util.Scanner;

class Q05_02 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("�ϐ�x��float�^�ŁA�ϐ�y��double�^�ł��B");
		System.out.print("x�F");
		float x = keyboardIn.nextFloat();
		System.out.print("y�F");
		double y = keyboardIn.nextDouble();
		System.out.printf("x = %.8f\ny = %.17f",x ,y);
	}
}
