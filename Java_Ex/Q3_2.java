import java.util.Scanner;

class Q3_2 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = keyboardIn.nextInt();
		System.out.print("����B�F");
		int b = keyboardIn.nextInt();
		
		if(a % b == 0){
			System.out.println("B��A�̖񐔂ł��B");
		}else{
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		}
	}
}