import java.util.Scanner;

public class Q15_3 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("������s1�F");
		String s1 = keyboardIn.next();
		System.out.print("������s2�F");
		String s2 = keyboardIn.next();
		keyboardIn.close();
		int idx = s1.indexOf(s2);
		if(idx == -1) {
			System.out.println("s1����s2�͊܂܂�܂���B");
		}else {
			System.out.println("s1�F" + s1);
			System.out.print("s2�F");
			for (int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			System.out.println(s2);		
		}
	}

}