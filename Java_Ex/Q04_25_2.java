import java.util.Scanner;

class Q04_25_2 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = keyboardIn.nextInt();
		
		int sum = 0;
		int ave = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print("�����F");
			int t = keyboardIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("���v��1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum += t;
			ave = sum / i;
		}
		System.out.println("���v��" + sum + "�A���ς�" + ave + "�ł��B");
	}
}
