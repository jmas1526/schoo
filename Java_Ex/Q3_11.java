import java.util.Scanner;

class Q3_11 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = keyboardIn.nextInt();
		System.out.print("����B�F");
		int b = keyboardIn.nextInt();
		int diff = a >= b ? a-b : b-a;
		if (diff > 10){
			System.out.println("�����̍���11�ȏ�ł��B");
		}else{
			System.out.println("�����̍���10�ȉ��ł��B");
		}
	}
}