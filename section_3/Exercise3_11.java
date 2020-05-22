import java.util.Scanner;

class Exercise3_11{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数A：");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：");
		int b=stdIn.nextInt();
		
		int x=a>b ? a-b:b-a;
		System.out.println("それらの値の差は"+(x>=10 ? "それらの差は11以上です。":"それらの差は10以下です"));
		
	}
}