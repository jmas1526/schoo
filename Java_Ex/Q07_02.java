import java.util.Scanner;
class Q07_02
 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = keyboardIn.nextInt();
		System.out.print("����b�F");
		int b = keyboardIn.nextInt();
		System.out.print("����c�F");
		int c = keyboardIn.nextInt();
		System.out.println("�ŏ��l�F" + min(a,b,c));
	}
	
	public static int min(int a, int b, int c){
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		return min;
	}
}
