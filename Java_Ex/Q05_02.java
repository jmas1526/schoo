import java.util.Scanner;

class Q05_02 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x：");
		float x = keyboardIn.nextFloat();
		System.out.print("y：");
		double y = keyboardIn.nextDouble();
		System.out.printf("x = %.8f\ny = %.17f",x ,y);
	}
}
