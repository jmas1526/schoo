import java.util.Scanner;

public class prac_2_10 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("姓：");
		String first = stdln.nextLine();
		System.out.print("名：");
		String last = stdln.nextLine();


		System.out.println("こんにちは"+ first + last +"さん。");

	}
}