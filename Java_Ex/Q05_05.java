import java.util.Scanner;

class Q05_05 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�����F");
		int x = keyboardIn.nextInt();
		System.out.print("�����F");
		int y = keyboardIn.nextInt();
		System.out.print("�����F");
		int z = keyboardIn.nextInt();
		
		int sum = x + y + z;
		double ave = (double)sum / 3;
		
		System.out.println("���v��" + sum + "\n���ς�" + ave);
	}
}
