import java.util.Scanner;

class Q3_3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("���̒l�͐��ł��B");
		else if(n < 0)
			System.out.println("���̒l�͕��ł��B");
		else if (n == 0)
			System.out.println("���̒l��0�ł��B");
	}
}

/*
���K3-3�̉�
3�̏�����n�ɓ���ׂ����ׂĂ̏�����ԗ����Ă���̂ŁAn == 0 �Ƃ��Ă����͂Ȃ��B
*/