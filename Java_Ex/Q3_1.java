import java.util.Scanner;

class Q3_1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int i = keyboardIn.nextInt();
		if(i < 0){
			i = - i;
		}
		System.out.println("その絶対値は" + i + "です。");
	}
}