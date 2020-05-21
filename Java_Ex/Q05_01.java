import java.util.Scanner;

class Q05_01 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数：");
		int n = keyboardIn.nextInt();
		
		System.out.printf("8進数では%oです。\n16進数では%xです。",n ,n);
	}
}
