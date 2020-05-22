import java.util.Scanner;

class Exercise7_3{
	
	static int med(int a,int b,int c){
		
		if (a > b){
			int t = a;
			a = b;
			b = t;
		}
		
		if (b >c){
			int t = b;
			b = c;
			c = t;
		}
		
		if (a > b){
			int t = a;
			a = b;
			b = t;
		}
		
		int med = b;
		
		return med;
		
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("3‚Â‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		
		int a=stdIn.nextInt();
		
		int b=stdIn.nextInt();

		int c=stdIn.nextInt();
		
		System.out.print("’†‰›’l‚Í"+med(a,b,c)+"‚Å‚·B");
	}
}
