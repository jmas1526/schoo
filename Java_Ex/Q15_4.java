import java.util.Scanner;

public class Q15_4 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("double�F");
		double x = keyboardIn.nextDouble();
		System.out.print("�����_�ȉ�p���F");
		int p = keyboardIn.nextInt();
		System.out.print("�S��w���F");
		int w = keyboardIn.nextInt();
		keyboardIn.close();
		printDouble(x,p,w);
	}
	
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p),x); //printf(%w.pf,x)
	}

}
