public class prac_06_02 {
	public static void main(String[] args) {

        int[] a = new int[5];

        for (int i=0; i<a.length; i++) {
            a[i] = 5-i;
            System.out.printf("int[%d] = %d\n", i, a[i]);
        }
    }
}