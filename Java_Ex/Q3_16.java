import java.util.Scanner;

class Q3_16 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数a：");	int a = keyboardIn.nextInt();
		System.out.print("整数b：");	int b = keyboardIn.nextInt();
		System.out.print("整数c：");	int c = keyboardIn.nextInt();
		
		int t;
		
		if(a > b){
			t = b;
			b = a;
			a = t;
		}
		if(a > c){
			t = c;
			c = a;
			a = t;
		}
		if(b > c){
			t = c;
			c = b;
			b = t;
		}
		System.out.println("昇順："+ a + ", " + b + ", " + c);
	}
}