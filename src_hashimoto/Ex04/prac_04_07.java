import java.util.Scanner;

public class prac_04_07 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        System.out.print("何個表示しますか：");
        int n = stdln.nextInt();

        int i = 0;
        while (i < n){
            char c = (i % 2 == 0) ? '*' : '+';
            System.out.print(c);
            i++;
        }
        if (n >= 0) {
            System.out.println();
        }
    }
}