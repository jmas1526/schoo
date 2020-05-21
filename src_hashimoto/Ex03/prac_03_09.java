import java.util.Scanner;

public class prac_03_09 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a：");
        int a = stdln.nextInt();
        System.out.print("整数b：");
        int b = stdln.nextInt();

        int max = a > b ? a : b;

        System.out.print("大きいほうの値は"+ max +"です。");
        
	}
}