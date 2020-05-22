import java.util.Scanner;

class Exercise5_5{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数1："); int a=stdIn.nextInt();
		System.out.print("整数2："); int b=stdIn.nextInt();
		System.out.print("整数3："); int c=stdIn.nextInt();
		
		System.out.println("合計："+(a+b+c));
		System.out.println("平均："+(double)(a+b+c)/3);
	}
}
