import java.util.Scanner;

public class prac_04_12 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("カウントアップします。");
        
        int x;
        do {
            System.out.print("正の整数値：");
            x = stdln.nextInt();
        } while (x <= 0);

        for (int i=0; i<=x; i++){
            System.out.println(i);
        }
    }
}