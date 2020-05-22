import java.util.Scanner;

class Exercise3_10{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数A：");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：");
		int b=stdIn.nextInt();
		
		System.out.println("それらの値の差は"+(a>b ? a-b:b-a)+"です。");
		
	}
}