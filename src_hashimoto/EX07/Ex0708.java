import java.util.Random;

public class Ex0708 {

	public static void main(String[] args) {


		System.out.println(random(3, 8));
		System.out.println(random(5, 11));
		System.out.println(random(9, 6));
		System.out.println(random(-7, 4));
		System.out.println(random(-7, -4));

	}

	static int random(int a, int b) {

		if( a >= b) return a;

		Random rand = new Random();

		int r = rand.nextInt(b-a+1);

		return r+a;
	}

}
