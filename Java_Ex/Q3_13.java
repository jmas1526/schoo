import java.util.Scanner;

class Q3_13 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = keyboardIn.nextInt();
		System.out.print("����B�F");
		int b = keyboardIn.nextInt();
		System.out.print("����C�F");
		int c = keyboardIn.nextInt();
		
		if (a > b){
			int n = a;
			a = b;
			b = n;
		}
		if (a > c){
			int n = a;
			a = c;
			c = n;
		}if (b > c){
			int n = b;
			b = c;
			c = n;
		}
		System.out.println("�����l�F" + b);
	}
}