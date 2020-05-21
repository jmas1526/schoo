import java.util.Scanner;
class Q07_01 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("®”F");
		int n = keyboardIn.nextInt();
		System.out.println("returnF" + signOf(n));
	}
	
	public static int signOf(int n){
		if(n > 0) return 1;
		else if(n == 0) return 0;
		else return -1;
	}
}
