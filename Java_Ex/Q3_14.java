import java.util.Scanner;

class Q3_14 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����a�F");	int a = keyboardIn.nextInt();
		System.out.print("����b�F");	int b = keyboardIn.nextInt();
		
		int min, max;
		
		if (a != b){
			
			if (a > b){
				min = b;
				max = a;
			}else{
				min = a;
				max = b;
			}
			System.out.println("�������ق��̒l��" + min + "�ł��B");
			System.out.println("�������ق��̒l��" + max + "�ł��B");
		}else{
			System.out.println("��̒l�͓����ł��B");
		}
		
	}
}