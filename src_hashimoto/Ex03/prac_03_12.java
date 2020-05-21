import java.util.Scanner;

public class prac_03_12 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a：");
        int a = stdln.nextInt();
        System.out.print("整数b：");
        int b = stdln.nextInt();
        System.out.print("整数c：");
        int c = stdln.nextInt();

        int min = a; 

        if (min > b) {
            min = b;
        }
            
        if (min > c) {
            min = c;
        }
        
        System.out.print("最小値は"+ min +"です。");

	}
}