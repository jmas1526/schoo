import java.util.Scanner;

class Q04_09 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		int n;
		do{
			
			System.out.print("®”’lF");
			n = keyboardIn.nextInt();
		}while(n <= 0);
		
		int i = 1;
		int pro = 1;
		while(n > i) {
			i++;
			pro *= i;
		}
		
		System.out.println("1‚©‚ç"+ i + "‚Ü‚Å‚ÌÏ‚Í" + pro + "‚Å‚·B");
	}
}
