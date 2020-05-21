import java.util.Scanner;

class Q04_11 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			
			System.out.print("³‚Ì®”’lF");
			n = keyboardIn.nextInt();
		}while(n <= 0);
		for(; n >= 0; n--) {
			System.out.println(n);
		}
	}
}
