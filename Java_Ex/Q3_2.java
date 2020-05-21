import java.util.Scanner;

class Q3_2 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = keyboardIn.nextInt();
		System.out.print("整数B：");
		int b = keyboardIn.nextInt();
		
		if(a % b == 0){
			System.out.println("BはAの約数です。");
		}else{
			System.out.println("BはAの約数ではありません。");
		}
	}
}