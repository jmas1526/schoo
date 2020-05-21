import java.util.Scanner;

public class prac_03_13 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a：");
        int a = stdln.nextInt();
        System.out.print("整数b：");
        int b = stdln.nextInt();
        System.out.print("整数c：");
        int c = stdln.nextInt();

        int tmp; 

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
            
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        
        System.out.print("中央値は"+ b +"です。");

	}
}