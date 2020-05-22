import java.util.Scanner;

class Exercise4_11{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int x;
		
		System.out.println("カウントダウンします。");
		do{
			System.out.print("正の整数値：");
			x=stdIn.nextInt();
		}while (x<=0);
		
		for(int i=0; i<x; x--){
			System.out.println(x);
		}
	}
}
