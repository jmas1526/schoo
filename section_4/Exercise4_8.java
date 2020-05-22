import java.util.Scanner;

class Exercise4_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.print("正の整数値：");
			n=stdIn.nextInt();
		}while (n<0);
		
		int i=0;
		
		while (n>0){
			n/=10;
			i++;
		}
		
		System.out.print("その値は"+i+"桁です。");
	}
}

		
		
		
		