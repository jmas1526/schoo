import java.util.Scanner;
import java.util.Random;

class Exercise6_15{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int flag1=0;
		int flag2=0;
		int number=0;
		
		String []DayE ={"Monday","Tuesday","Wednesday","Thirsday","Friday","Satuaday","Sunday"};
		String []DayJ ={"Œ—j“ú","‰Î—j“ú","…—j“ú","–Ø—j“ú","‹à—j“ú","“y—j“ú","“ú—j“ú"};
		
		System.out.println("‰pŒê‚Ì—j“ú–¼‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n‚È‚¨Aæ“ª‚Í‘å•¶š‚ÅA2•¶š–ÚˆÈ~‚Í¬•¶š‚Æ‚µ‚Ü‚·B");
		
	retry:
		while(true){
			if(flag2 != 1){
				number=rand.nextInt(7);
				if(flag1==number){
					continue retry;
				}
			}
			
			System.out.print(DayJ[number]+"F");
			String m=stdIn.next();
			
			if(!(m.equals(DayE[number]))){
				System.out.println("ˆá‚¢‚Ü‚·B");
				flag2 = 1;
			}else{
				System.out.println("³‰ğ‚Å‚·B‚à‚¤ˆê“xH@1cYes/0cNo");
				int question=stdIn.nextInt();
				flag1 = number;
				flag2 = 0;
				System.out.println();
				
				if (!(question==1)){
					break;
				}
			}
		}
	}
}