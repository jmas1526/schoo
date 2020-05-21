import java.util.Scanner;

class Q3_4 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("値a：");
		double a = keyboardIn.nextDouble();
		System.out.print("値b：");
		double b = keyboardIn.nextDouble();
		
		if(a != b){
			if(a > b){
			System.out.println("aのほうが大きいです。");
			}else{
			System.out.println("bのほうが大きいです。");
			}
		}else{
			System.out.println("aとbは同じ値です。");
		}
	}
}