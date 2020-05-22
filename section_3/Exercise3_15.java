import java.util.Scanner;

class Exercise3_15{
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
			System.out.println("二つの値は同じで、その値は"+a+"です。");
		}else{
			System.out.println("A>=Bとなるようにソートしました。");
			System.out.println("Aの値は："+a+"\nBの値は："+b);
			}
			
		
	}
}