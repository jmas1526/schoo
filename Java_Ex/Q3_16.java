import java.util.Scanner;

class Q3_16 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����a�F");	int a = keyboardIn.nextInt();
		System.out.print("����b�F");	int b = keyboardIn.nextInt();
		System.out.print("����c�F");	int c = keyboardIn.nextInt();
		
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
		System.out.println("�����F"+ a + ", " + b + ", " + c);
	}
}