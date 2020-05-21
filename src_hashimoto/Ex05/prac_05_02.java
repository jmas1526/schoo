import java.util.Scanner;

public class prac_05_02 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("変数xはfloat型で、変数yはdouble型です。");

        System.out.print("x：");
        float x = stdln.nextFloat();
        System.out.print("y：");
        double y = stdln.nextDouble();

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}