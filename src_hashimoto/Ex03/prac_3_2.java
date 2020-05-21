import java.util.Scanner;

public class prac_3_2 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数A：");
        int a = stdln.nextInt();
        System.out.print("整数B：");
        int b = stdln.nextInt();
        
        if (a%b == 0) {
            System.out.println("BはAの約数です。");
        } else {
            System.out.println("BはAの約数ではありません。");
        }

	}
}