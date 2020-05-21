import java.util.Scanner;

public class prac_04_05 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("カウントダウンします。");
        
        int x;
        do {
            System.out.print("正の整数値：");
            x = stdln.nextInt();
        } while (x <= 0);

        while (x >= 0){
            System.out.println(--x);
        }
    }
}