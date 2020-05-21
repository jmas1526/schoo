import java.util.Scanner;
class Q07_07 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("左下直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = keyboardIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			putStars(i);
			System.out.println();
		}
	}
	
	static void putStars(int n) {
		for(int i = 1; i <= n; i++) {
			putChars('*', i);
		}
	}
	
	public static void putChars(char c,int n){
		while(n-- > 0);
		System.out.print(c);
	}
}
