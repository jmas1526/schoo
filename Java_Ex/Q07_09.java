import java.util.Scanner;
class Q07_09 {
	public static void main(String[] args){
		System.out.println("正の整数しか受け付けません");
		System.out.print(readPlusInt());
	}
	
	public static int readPlusInt() {
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("正の整数値：");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		return n;
	}
}
