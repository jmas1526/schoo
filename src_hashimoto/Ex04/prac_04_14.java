import java.util.Scanner;

public class prac_04_14 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        
        int n;
        do {
            System.out.print("nの値：");
            n = stdln.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i=1; i <= n; i++){
            System.out.print(i);
            sum += i;
            if (i < n){
                System.out.print(" + ");
            }
        }

        System.out.println(" = "+ sum);

    }
}