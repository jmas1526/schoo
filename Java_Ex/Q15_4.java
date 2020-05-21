import java.util.Scanner;

public class Q15_4 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("double：");
		double x = keyboardIn.nextDouble();
		System.out.print("小数点以下p桁：");
		int p = keyboardIn.nextInt();
		System.out.print("全体w桁：");
		int w = keyboardIn.nextInt();
		keyboardIn.close();
		printDouble(x,p,w);
	}
	
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p),x); //printf(%w.pf,x)
	}

}
