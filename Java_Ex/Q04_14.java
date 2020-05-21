import java.util.Scanner;

class Q04_14 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("n‚Ì’lF");
			n = keyboardIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			if(i < n) System.out.print(" + ");
		}
		
		System.out.println(" = " + sum);
	}
}
