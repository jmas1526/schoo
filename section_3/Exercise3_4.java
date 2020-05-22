import java.util.Scanner;

class Exercise3_4{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数A：");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：");
		int b=stdIn.nextInt();
		
		if (a>b)
		System.out.println("Aのほうが大きいです。");
		else if (b>a)
		System.out.println("Bのほうが大きいです。");
		else
		System.out.println("AとBは同じ値です。");
		
	}
}