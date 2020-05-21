import java.util.Scanner;

class Q3_11 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = keyboardIn.nextInt();
		System.out.print("整数B：");
		int b = keyboardIn.nextInt();
		int diff = a >= b ? a-b : b-a;
		if (diff > 10){
			System.out.println("それらの差は11以上です。");
		}else{
			System.out.println("それらの差は10以下です。");
		}
	}
}