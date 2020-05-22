import java.util.Scanner;

class Exercise4_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("カウントダウンします。\n");
		
		int x;
		
		do{
			System.out.print("正の整数値：");
			x=stdIn.nextInt();
		}while (x<=0);
		
		while (x>=0){
			System.out.println(--x);
		}
	}
}
