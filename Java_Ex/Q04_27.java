import java.util.Scanner;
import java.util.Random;

class Q04_27 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		
		int max;
		do {
			System.out.print("�����񐔁F");
			max = keyboardIn.nextInt();
		}while(max < 1);
		
		int count = 0;
		int x;
		do {
			System.out.print("�������ȁF");
			x = keyboardIn.nextInt();
			count++;
			if(count > max) break;
			
			if(x > no)
				System.out.println("�����Ə����Ȑ�����B");
			else if(x < no)
				System.out.println("�����Ƒ傫�Ȑ�����B");
		}while (x != no);
		
		if (x == no)
			System.out.println("�����ł��B");
		else
			System.out.println("���Ԑ؂�ł��B������" + no + "�ł��B");
	}
}
