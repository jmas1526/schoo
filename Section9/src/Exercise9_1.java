import java.util.Scanner;

public class Exercise9_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		Human[] a = {new Human("sato",173,77)};
		Human[] b;
		b = new Human[] {new Human("yamada",999,999)};
		
		a[0].putSpec();
		b[0].putSpec();
	}

}
