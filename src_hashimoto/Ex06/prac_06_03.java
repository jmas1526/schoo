public class prac_06_03 {
	public static void main(String[] args) {

        double[] a = new double[5];

        for (int i=0; i<a.length; i++) {
            a[i] = (double)(i+1)*11/10;
            System.out.printf("int[%d] = %.1f\n", i, a[i]);
        }
    }
}