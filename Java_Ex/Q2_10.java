import java.util.Scanner;

class Q2_10 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("姓：");
		
		String lastName = keyboardIn.next();
		
		System.out.print("名：");
		String firstName = keyboardIn.next();
		
		System.out.println("こんにちは" + lastName + firstName + "さん");
	}
}