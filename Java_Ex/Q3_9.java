import java.util.Scanner;

class Q3_9 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("値a：");
		double a = keyboardIn.nextDouble();
		System.out.print("値b：");
		double b = keyboardIn.nextDouble();
		
		if(a != b){
			System.out.println((a > b ? a : b) +"のほうが大きいです。");
		}else{
			System.out.println("aとbは同じ値です。");
		}
	}
}