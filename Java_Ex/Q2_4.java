import java.util.Scanner;

class Q2_4 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int in = keyboardIn.nextInt();
		System.out.println("10���������l��"+ (in + 10) + "�ł�");
		System.out.println("10���������l��"+ (in - 10) + "�ł�");
	}
}