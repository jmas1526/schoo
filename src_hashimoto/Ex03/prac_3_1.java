import java.util.Scanner;

public class prac_3_1 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数値：");
        int x = stdln.nextInt();
        
        if (x<0){
            x = -x;
        }

        System.out.println("その絶対値は"+ x +"です。");

	}
}