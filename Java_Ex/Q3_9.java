import java.util.Scanner;

class Q3_9 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�la�F");
		double a = keyboardIn.nextDouble();
		System.out.print("�lb�F");
		double b = keyboardIn.nextDouble();
		
		if(a != b){
			System.out.println((a > b ? a : b) +"�̂ق����傫���ł��B");
		}else{
			System.out.println("a��b�͓����l�ł��B");
		}
	}
}