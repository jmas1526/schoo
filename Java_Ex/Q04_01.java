import java.util.Scanner;

class Q04_01 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		int retry;
		do{
			System.out.print("�����l�F");
			int n = keyboardIn.nextInt();
			
			if(n > 0)
				System.out.println("���̒l�͐��ł��B");
			else if(n < 0)
				System.out.println("���̒l�͕��ł��B");
			else
				System.out.println("���̒l��0�ł��B");
			do{
				System.out.print("Continue? Yes...1 / No...0�F");
				retry = keyboardIn.nextInt();
			}while (retry != 0 && retry != 1);
		}while(retry == 1);
	}
}