import java.util.Scanner;
class Q07_04
 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("®”nF");
		int n = keyboardIn.nextInt();
		System.out.println("‘˜aF" + sumUp(n));
	}
	
	public static int sumUp(int n){
		int sum = 0;
		
		do sum += n;
		while(n-- > 0);
		
		return sum;
	}
}
