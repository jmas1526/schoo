import java.util.Scanner;
import java.util.Random;

class Exercise7_12{
	
	static void printBits(int x){
		
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
		System.out.println();
	}
	
	
	static int rRotate(int x,int n){
		
		int a=x>>>n;
		x<<=32-n;
		
		x=a|x;
		return x;
		
	}
	static int lRotate(int x,int n){
		
		int a=x<<n;
		x>>>=32-n;
		
		x=a|x;
		return x;
	}
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数：");
		int a = stdIn.nextInt();
		System.out.println("2進数表示");
		printBits(a);
		
		System.out.print("何ビットシフトしますか：");
		int b = stdIn.nextInt();
		
		System.out.println();
		
		System.out.println("左に"+b+"ビット回転した値："+lRotate(a,b));
		System.out.println("左に"+b+"ビット回転した値（2進数表示）");
		printBits(lRotate(a,b));
		
		System.out.println();
		
		System.out.println("右に"+b+"ビット回転した値："+rRotate(a,b));
		System.out.println("左に"+b+"ビット回転した値（2進数表示）");
		printBits(rRotate(a,b));
	}
}
