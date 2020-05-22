import java.util.Scanner;
import java.util.Random;

class Exercise4_2{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand =new Random();
		
		int no=rand.nextInt(90)+10;
		int n;
		
		System.out.println("数当てゲーム");
		
		do{
			System.out.print("10～99の数字を入力してください。");
			n=stdIn.nextInt();
		
			if (no>n)
			System.out.println("もっと大きな数です。");
			else if (no<n)
			System.out.println("もっと小さな数です。");
		}
		while (no != n);
		
		System.out.println("正解です。おめでとうございます。");
	}
}
