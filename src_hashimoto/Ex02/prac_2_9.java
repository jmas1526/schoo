import java.util.Random;

public class prac_2_9 {
	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println(rand.nextDouble());
		System.out.println((double)rand.nextInt(10) + rand.nextDouble());
		System.out.println(rand.nextInt(2)-1 + rand.nextDouble());

	}
}