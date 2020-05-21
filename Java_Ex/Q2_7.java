import java.util.Random;

class Q2_7 {
	public static void main(String[] args){
		Random rand = new Random();
		int plusInt1 = rand.nextInt(9)+ 1;
		System.out.println("ˆêŒ…‚Ì³‚Ì®”F" + plusInt1);
		int minusInt1 = - rand.nextInt(9) - 1;
		System.out.println("ˆêŒ…‚Ì•‰‚Ì®”F" + minusInt1);
		int plusInt2 = rand.nextInt(90)+10;
		System.out.println("“ñŒ…‚Ì³‚Ì®”F" + plusInt2);
	}
}