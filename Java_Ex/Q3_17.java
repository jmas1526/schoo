import java.util.Scanner;
import java.util.Random;

class Q3_17 {
	public static void main(String[] args){
		Random rand = new Random();
		int n = rand.nextInt(3);
		
		switch(n){
		case 0: System.out.println("�O�[");
			break;
		case 1: System.out.println("�`���L");
			break;
		case 2:System.out.println("�p�[");
			break;
		}
	}
}