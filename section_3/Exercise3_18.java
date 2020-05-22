import java.util.Scanner;

class Exercise3_18{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("‰½ŒHF");
		int a=stdIn.nextInt();
		
		
		switch (a){
			case 3:
			case 4:
			case 5: System.out.println("t‚Å‚·"); break;
			case 6:
			case 7:
			case 8: System.out.println("‰Ä‚Å‚·"); break;
			case 9: 
			case 10:
			case 11: System.out.println("H‚Å‚·"); break;
			case 12:
			case 1: 
			case 2: System.out.println("“~‚Å‚·"); break;
			default: System.out.println("1`12‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢"); break;
		}
		
	}
}