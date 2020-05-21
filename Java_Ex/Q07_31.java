import java.util.Scanner;

class Q07_31 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		//�z��̍쐬
		System.out.print("a(int)�F");
		int a = keyboardIn.nextInt();
		System.out.print("b(long)�F");
		long b = keyboardIn.nextLong();
		System.out.print("c(float)�F");
		float c = keyboardIn.nextFloat();
		System.out.print("d(double)�F");
		double d = keyboardIn.nextDouble();
		
		System.out.println("abs(a) = " + absolute(a));
		System.out.println("abs(b) = " + absolute(b));
		System.out.println("abs(c) = " + absolute(c));
		System.out.println("abs(d) = " + absolute(d));
	}
	
	
	public static int absolute(int a){
		return a >= 0 ? a : -a;
	}
	public static long absolute(long a){
		return a >= 0 ? a : -a;
	}
	public static float absolute(float a){
		return a >= 0 ? a : -a;
	}
	public static double absolute(double a){
		return a >= 0 ? a : -a;
	}
}
