import java.util.Random;

class Q2_7 {
	public static void main(String[] args){
		Random rand = new Random();
		int plusInt1 = rand.nextInt(9)+ 1;
		System.out.println("�ꌅ�̐��̐����F" + plusInt1);
		int minusInt1 = - rand.nextInt(9) - 1;
		System.out.println("�ꌅ�̕��̐����F" + minusInt1);
		int plusInt2 = rand.nextInt(90)+10;
		System.out.println("�񌅂̐��̐����F" + plusInt2);
	}
}