import java.util.Scanner;

class Q04_26 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = keyboardIn.nextInt();
		
		int sum = 0;
		int ave = 0;
		int count = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print("�����F");
			int t = keyboardIn.nextInt();
			if (t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count++;
			ave = sum / count;
		}
		System.out.println("���v��" + sum + "�A���ς�" + ave + "�ł��B");
	}
}
