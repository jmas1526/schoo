import java.util.Scanner;

class Q04_04 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do {
			System.out.print("���̐����l�F");
			x = keyboardIn.nextInt();
		}while(x <= 0);
		
		while(x >=0) {
			System.out.println(x);
			x--;
		}
		System.out.println("�I�����F" + x);
	}
}