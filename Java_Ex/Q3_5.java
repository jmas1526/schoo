import java.util.Scanner;

class Q3_5 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�����F");
		int n = keyboardIn.nextInt();
		
		if(n > 0){
			if(n % 5 == 0){
			System.out.println("���̒l��5�Ŋ���؂�܂��B");
			}else{
			System.out.println("���̒l��5�Ŋ���؂�܂���B");
			}
		}else{
			System.out.println("���łȂ��l�����͂���܂����B");
		}
	}
}