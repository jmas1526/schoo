import java.util.Scanner;
import java.util.Random;

class Exercise7_9{
	
	static Scanner stdIn=new Scanner(System.in);
	
	static int readPlusInt(){
		
		int a;
		do{	
			System.out.print("³‚Ì®”’lF");
			a=stdIn.nextInt();
		}while(a<=0);
		
		return a;
	}
	
	public static void main(String[]args){
		
		readPlusInt();
	}
}
