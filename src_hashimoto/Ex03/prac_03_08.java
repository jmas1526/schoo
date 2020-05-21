import java.util.Scanner;

public class prac_03_08 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("点数：");
        int x = stdln.nextInt();
        
        if (x >= 0 && x <= 100) {
            if (x >= 80) {
                System.out.println("優");
            } else if (x >= 70) {
                System.out.println("良");
            } else if (x >= 60) {
                System.out.println("可");
            } else {
                System.out.println("不可");
            }
        } else {
            System.out.println("点数が正しくありません。");
        }

	}
}