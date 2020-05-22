import java.util.Scanner;

class Exercise3_9{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("実数A：");
		int a=stdIn.nextInt();
		
		System.out.print("実数B：");
		int b=stdIn.nextInt();
		
		System.out.println("大きいほうの値は"+(a>b ? a:b)+"です。");
		
	}
}