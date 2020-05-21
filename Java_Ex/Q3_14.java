import java.util.Scanner;

class Q3_14 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数a：");	int a = keyboardIn.nextInt();
		System.out.print("整数b：");	int b = keyboardIn.nextInt();
		
		int min, max;
		
		if (a != b){
			
			if (a > b){
				min = b;
				max = a;
			}else{
				min = a;
				max = b;
			}
			System.out.println("小さいほうの値は" + min + "です。");
			System.out.println("小さいほうの値は" + max + "です。");
		}else{
			System.out.println("二つの値は同じです。");
		}
		
	}
}