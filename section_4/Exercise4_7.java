import java.util.Scanner;

class Exercise4_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//List4-7
		
		System.out.print("âΩå¬ï\é¶ÇµÇ‹Ç∑Ç©ÅF");
		int n=stdIn.nextInt();
		int i=0;
		int j=1;
		
		while (i<n){
			System.out.print('*');
			i=i+2;
			if (j<n){
				System.out.print('+');
			}
			j=j+2;	
		}
		System.out.print("");
	}
}
