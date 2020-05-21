import java.util.Scanner;
import java.util.Random;

class Q07_10 {
	static Scanner keyboardIn = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args){
		System.out.println("暗算力トレーニング!!");
		do{
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int answer = calc(x,y,z);
			while(true){
				if(answer == keyboardIn.nextInt()) break;
				System.out.println("違いますよ");
			}
		}while(confirmRetry());
	}
	
	public static boolean confirmRetry() {
		int cont;
		do{
			System.out.print("もう一度?<Yes...1/No...0>：");
			cont = keyboardIn.nextInt();
		}while(cont != 0 && cont != 1);
		
		return cont == 1;
	}
	
	public static int calc(int x, int y ,int z){
		int mode = rand.nextInt(4);
		int answer = 0;
		switch (mode) {
		case 0:
			System.out.print(x + " + " + y + " + " + z + " = ");
			answer = x + y + z;
			break;
		case 1:
			System.out.print(x + " + " + y + " - " + z + " = ");
			answer = x + y - z;
			break;
		case 2:
			System.out.print(x + " - " + y + " + " + z + " = ");
			answer = x - y + z;
			break;
		case 3:
			System.out.print(x + " - " + y + " - " + z + " = ");
			answer = x - y - z;
			break;
		}
		
		return answer;
	}
}
