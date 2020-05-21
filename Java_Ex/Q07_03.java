import java.util.Scanner;
class Q07_03
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
		int t;
		//a>=b
		if (a < b) {
			t = a; a = b; b = t;
		}
		//a>=c
		if (a < c) {
			t = a; a = c; c = t;
		}
		//b>=c
		if (b < c) {
			t = b; b = c; c = t;
		}
		return b;
	}
}
