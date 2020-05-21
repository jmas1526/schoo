import java.util.Scanner;

class Q3_10 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("êÆêîaÅF");
		int a = keyboardIn.nextInt();
		System.out.print("êÆêîbÅF");
		int b = keyboardIn.nextInt();
		
		System.out.println("ç∑ÇÕ" + (a >= b ? a - b : b - a) + "Ç≈Ç∑ÅB");
	}
}