import java.util.Random;

public class prac_2_7 {
	public static void main(String[] args) {
	
		Random rand = new Random();

		System.out.println(rand.nextInt(9)+1);
		System.out.println((rand.nextInt(9)+1)*(-1));
		System.out.println(rand.nextInt(90)+10);

	}
}