import java.util.Scanner;

class Q04_25_1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = keyboardIn.nextInt();
		
		int sum = 0;
		int ave = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print("����(0�ŏI��)�F");
			int t = keyboardIn.nextInt();
			if (t == 0) break;
			sum += t;
			ave = sum / i;
		}
		System.out.println("���v��" + sum + "�A���ς�" + ave + "�ł��B");
	}
}
