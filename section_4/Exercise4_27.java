import java.util.Scanner;
import java.util.Random;

class Exercise4_27{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand =new Random();
		
		int no=rand.nextInt(100);
		int n;
		int count=0;
		System.out.println("数当てゲーム");
		System.out.print("チャンス回数：");
		int x=stdIn.nextInt();
		
	Outer:
		while(true){
			for(int i=0;i<x;i++){
				if(count==x){
					System.out.println("正解は"+no+"でした。\nゲームを終了します。");
					break Outer;
				}
				
				System.out.print("0～99の数字を入力してください。");
				n=stdIn.nextInt();
				count++;
				
				if (no>n){
					System.out.println("もっと大きな数です。");
				}else if (no<n){
					System.out.println("もっと小さな数です。");
				}else{
					System.out.println("正解です。おめでとうございます。");
					break Outer;
				}
			}
		}
	}
}
