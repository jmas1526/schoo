import java.util.Scanner;
class Q07_09 {
	public static void main(String[] args){
		System.out.println("³‚Ì®”‚µ‚©ó‚¯•t‚¯‚Ü‚¹‚ñ");
		System.out.print(readPlusInt());
	}
	
	public static int readPlusInt() {
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("³‚Ì®”’lF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		return n;
	}
}
