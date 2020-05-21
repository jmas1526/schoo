public class prac_05_06 {
	public static void main(String[] args) {

        float f = 0;
        int i = 0;

        System.out.println("  float       int");
        System.out.println("--------------------");

        System.out.printf("%.7f  %.7f\n", f, i/1000.0);

        for (i=1; i<=1000; i++) {
            f += 0.001;
            System.out.printf("%.7f  %.7f\n", f, i/1000.0);
        }
    }
}