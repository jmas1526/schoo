import java.util.Scanner;

class Exercise4_26{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数を加算し、平均値を出力します。");
		System.out.print("何個加算しますか：");
		int n=stdIn.nextInt();
		
		int sum=0;
		double ave=0;
		int count=0;
		
		for(int i=0;i<n;i++){
			System.out.print("整数：");
			int t=stdIn.nextInt();
			
			if (t<0){
				System.out.println("負の数は加算しません。");
			}else{
				count++;
				sum+=t;
			}
		}
		
		ave=(double)sum/(count);
		
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+ave+"です。");
	}
}
