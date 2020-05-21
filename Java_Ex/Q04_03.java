import java.util.Scanner;

class Q04_03 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("®”AF");
		int a = keyboardIn.nextInt();
		System.out.print("®”BF");
		int b = keyboardIn.nextInt();
		
		if (a < b){
			int t = a;
			a = b;
			b = t;
		}
		int i = 0;
		do{
			System.out.print((b + i) + " ");
			i++;
		}while(a-b >= i);
	}
}