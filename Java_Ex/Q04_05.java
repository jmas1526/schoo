import java.util.Scanner;

class Q04_05 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do {
			System.out.print("���̐����l�F");
			x = keyboardIn.nextInt();
		}while(x <= 0);
		
		while(x >=0) {
			System.out.println(--x);
		}
	}
}
/*
���K4-5�̉�
���͂��ꂽ�l-1����J�E���g�_�E�����n�܂�A0���߂���-1�܂ŃJ�E���g����Ă��܂�
*/
