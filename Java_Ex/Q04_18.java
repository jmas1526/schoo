import java.util.Scanner;

class Q04_18 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("n‚Ì’lF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "‚Ì2æ‚Í"  + (i * i));
		}
	}
}
