import java.util.Scanner;

class Exercise4_25{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//List4-17
		
		System.out.print("整数を加算し、平均値を出力します。");
		System.out.print("何個加算しますか：");
		int n=stdIn.nextInt();
		
		int sumA=0;
		double aveA;
		int i;
		
		for(i=1;i<=n;i++){
			System.out.print("整数（0で終了）：");
			int t=stdIn.nextInt();
			
			if (t==0){
				
				break;
			}
			sumA+=t;
		}
		aveA=(double)sumA/(i-1);
		System.out.println("合計は"+sumA+"です。");
		System.out.println("平均は"+aveA+"です。");
		
		
		
		//List4-18
		
		System.out.print("整数を加算し、平均値を出力します。");
		System.out.print("何個加算しますか：");
		int m=stdIn.nextInt();
		
		int sumB=0;
		double aveB;
		int j;
		
		for(j=1;j<=m;j++){
			System.out.print("整数：");
			int s=stdIn.nextInt();
			
			if (sumB+s>1000){
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sumB+=s;
		}
		aveB=(double)sumB/(j-1);
		System.out.println("合計は"+sumB+"です。");
		System.out.println("平均は"+aveB+"です。");
	}
}
