import java.util.Scanner;

class Q3_1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int i = keyboardIn.nextInt();
		if(i < 0){
			i = - i;
		}
		System.out.println("���̐�Βl��" + i + "�ł��B");
	}
}