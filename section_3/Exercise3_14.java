import java.util.Scanner;

class Exercise3_14{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数A：");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：");
		int b=stdIn.nextInt();
		
		if (a<b){
			int t=a;
			a=b;
			b=t;
		}
		
		if (a==b){
			System.out.println("二つの値は同じです。");
		}else{
				System.out.println("小さいほうの値は"+b+"\n大きいほうの値は"+a+"です。");
			}
			
		
	}
}