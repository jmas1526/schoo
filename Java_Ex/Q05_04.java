import java.util.Scanner;

class Q05_04 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数：");
		int x = keyboardIn.nextInt();
		System.out.print("整数：");
		int y = keyboardIn.nextInt();
		System.out.print("整数：");
		int z = keyboardIn.nextInt();
		
		int sum = x + y + z;
		double ave = sum / 3D;
		
		System.out.println("合計は" + sum + "\n平均は" + ave);
	}
}
