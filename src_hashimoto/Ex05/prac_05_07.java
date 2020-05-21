public class prac_05_07 {
	public static void main(String[] args) {

        int i = 0;

        System.out.println(" その値     2乗");
        System.out.println("-----------------");

        for (i=0; i<=1000; i++) {
            System.out.printf("%.4f  %.7f\n", i/1000.0, (i/1000.0)*(i/1000.0));
        }
    }
}