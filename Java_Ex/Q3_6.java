import java.util.Scanner;

class Q3_6 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�����F");
		int n = keyboardIn.nextInt();
		
		if(n > 0){
			if(n % 10 == 0){
			System.out.println("���̒l��10�̔{���ł��B");
			}else{
			System.out.println("���̒l��10�̔{���ł͂���܂���B");
			}
		}else{
			System.out.println("���łȂ��l�����͂���܂����B");
		}
	}
}