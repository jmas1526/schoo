import java.util.Scanner;

class Q04_17 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("®”’lF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("–ñ”‚Í" + count + "ŒÂ‚Å‚·B");
	}
}
