import java.util.Scanner;
class Q07_02
 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = keyboardIn.nextInt();
		System.out.print("整数b：");
		int b = keyboardIn.nextInt();
		System.out.print("整数c：");
		int c = keyboardIn.nextInt();
		System.out.println("最小値：" + min(a,b,c));
	}
	
	public static int min(int a, int b, int c){
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		return min;
	}
}
