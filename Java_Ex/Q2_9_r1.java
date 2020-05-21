import java.util.Random;

class Q2_9_r1 {
	public static void main(String[] args){
		Random rand = new Random();
		
		double num1 = rand.nextDouble();
		System.out.println("0.0ˆÈã1.0–¢–F" + num1);
		
		double num2 = rand.nextDouble() * 10;
		System.out.println("0.0ˆÈã10.0–¢–F" + num2);
		
		double num3 = rand.nextDouble() * 2 - 1;
		System.out.println("-1.0ˆÈã1.0–¢–F" + num3);
	}
}