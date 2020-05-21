import java.util.Scanner;

class Q3_3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("その値は正です。");
		else if(n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");
	}
}

/*
演習3-3の解答
3つの条件でnに入るべきすべての条件を網羅しているので、n == 0 としても問題はない。
*/