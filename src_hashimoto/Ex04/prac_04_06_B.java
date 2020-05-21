import java.util.Scanner;

public class prac_04_06_B {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        System.out.print("何個*を表示しますか：");
        int n = stdln.nextInt();

        int i = 1;
        while (i <= n){
            System.out.print('*');
            i++;
        }
        if (n >= 0) {
            System.out.println();
        }
    }
}