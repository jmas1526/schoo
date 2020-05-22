import java.util.Scanner;
import java.util.Random;

class Exercise7_11{
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数：");
		int a = stdIn.nextInt();
		System.out.print("何ビットシフトしますか：");
		int b = stdIn.nextInt();
		
		System.out.println("左に"+b+"ビットシフトした値："+(a<<b));
		System.out.println("右に"+b+"ビットシフトした値："+(a>>b));
	}
}
