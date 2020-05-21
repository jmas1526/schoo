import java.util.Scanner;

class Q10_05 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		Account a1 = new Account("A", "1314", 1000);
		Account a2 = new Account("B", "1243", 10101);
		System.out.println("Id:" + a2.getId());
		Account a3 = new Account("B", "1242", 10101);
		System.out.println("Id:" + a3.getId());
	}
}
