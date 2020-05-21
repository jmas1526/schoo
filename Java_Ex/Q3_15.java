import java.util.Scanner;

class Q3_15 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("®”aF");	int a = keyboardIn.nextInt();
		System.out.print("®”bF");	int b = keyboardIn.nextInt();
		
		if(a < b){
			int t = b;
			b = a;
			a = t;
		}
		System.out.println("~‡F"+ a + ", " + b);
	}
}