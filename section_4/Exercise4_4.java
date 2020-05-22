import java.util.Scanner;

class Exercise4_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("カウントダウンします。\n");
		
		int x;
		
		do{
			System.out.print("-1以上の整数値：");
			x=stdIn.nextInt();
		}while (x<-1);
		
		while (x>=-1){
			System.out.println(x);
			x--;
		}
	}
}
