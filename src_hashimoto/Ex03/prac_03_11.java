import java.util.Scanner;

public class prac_03_11 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a：");
        int a = stdln.nextInt();
        System.out.print("整数b：");
        int b = stdln.nextInt();

        int dif = a > b ? a-b : b-a;

        if (dif > 10) {
            System.out.print("それらの差は11以上です。");
        } else {
            System.out.print("それらの差は10以下です。");
        }
        
	}
}