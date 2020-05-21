import java.util.Scanner;
import java.util.Random;
class Q07_08 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("a以上b以下の乱数を生成します。");
		System.out.print("a：");
		int a = keyboardIn.nextInt();
		System.out.print("b：");
		int b = keyboardIn.nextInt();
		
		System.out.print("結果：");
		System.out.print(random(a,b));
	}
	
	public static int random(int a, int b) {
		Random rand = new Random();
		
		if (a >= b)
			return a;
		else{
			return rand.nextInt(b - a + 1) + a;
		}
	}
}
