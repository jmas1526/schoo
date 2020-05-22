import java.util.Scanner;

class Exercise3_13{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数A：");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：");
		int b=stdIn.nextInt();
		
		System.out.print("整数C：");
		int c=stdIn.nextInt();
		
		int t;
		
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		if (b>c){
			t=b;
			b=c;
			c=t;
		}
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		
		System.out.println("中央値は："+b);
	}
}