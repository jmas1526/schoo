import java.util.Scanner;

class Exercise7_4{
	
	static int sumUp(int n){
		
		int tmp=0;
		
		while (n > 0){
			tmp += n;
			n--;
		}
		
		return tmp;
		
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数を入力してください。：");
		int n=stdIn.nextInt();
		
		System.out.println(1+"からnまでの全整数の和を求めます。");
		
		System.out.print(sumUp(n));
	}
}
