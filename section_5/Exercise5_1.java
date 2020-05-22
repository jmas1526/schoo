import java.util.Scanner;

class Exercise5_1{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数値：");
		int a=stdIn.nextInt();
		
		System.out.printf("8進数では%o\n",a);
		System.out.printf("16進数では%x",a);
	}
}
