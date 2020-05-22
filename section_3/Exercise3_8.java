import java.util.Scanner;

class Exercise3_8{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("点数：");
		int a=stdIn.nextInt();
		
		System.out.print("判定：");
		
		if (a>=0)
		if (a>=0 && a<=59)
		System.out.println("不可");
		else if (a>=60 && a<=69)
		System.out.println("可");
		else if (a>=70 && a<=79)
		System.out.println("良");
		else if (a>=80 && a<=100)
		System.out.println("優");
		else
		System.out.println("正でない値が入力されました。");
		
	}
}