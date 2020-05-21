import java.util.Scanner;
import java.util.Random;

class Q04_02 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int x = rand.nextInt(90) + 10;
		int n;
		do{
			do{
				System.out.print("2Œ…‚Ì®”‚Í‚¢‚­‚Â‚©‚ÈF");
				n = keyboardIn.nextInt();
			}while(n < 10 || n > 99);
			
			if(n > x)
				System.out.println("‚à‚Á‚Æ¬‚³‚¢‚æ");
			else if(n < x)
				System.out.println("‚à‚Á‚Æ‘å‚«‚¢‚æ");
		}while(n != x);
		System.out.print("³‰ğII");
	}
}