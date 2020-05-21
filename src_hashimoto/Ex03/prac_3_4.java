import java.util.Scanner;

public class prac_3_4 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("a：");
        double a = stdln.nextDouble();
        System.out.print("b：");
        double b = stdln.nextDouble();
        
        if (a == b) {
            System.out.println("aとbは同じ値です。");
        } else {
            if (a > b) {
                System.out.println("aのほうが大きいです。");
            } else {
                System.out.println("bのほうが大きいです。");
            }
        }

	}
}