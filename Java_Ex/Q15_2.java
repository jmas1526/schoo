import java.util.Scanner;

public class Q15_2 {

	public static void main(String[] args) {
Scanner keyboadIn = new Scanner(System.in);
		
		System.out.print("•¶š—ñF");
		String s = keyboadIn.next();
		keyboadIn.close();
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + "F" + s.codePointAt(i));
		}

	}

}