import java.util.Scanner;

class Exercise4_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("®”AF");
		int a=stdIn.nextInt();
		
		System.out.print("®”BF");
		int b=stdIn.nextInt();
		
		int t;
		
		do{
			if (a>b){
				t=a;
				a=b;
				b=t;
			}
			
			System.out.print(a+" ");
			
			a++;
		}while (a<=b);
	}
}