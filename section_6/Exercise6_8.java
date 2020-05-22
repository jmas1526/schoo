import java.util.Scanner;

class Exercise6_8{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("要素数："); n=stdIn.nextInt();	
		}while(n<=0);
		
		double []a=new double[n];
		
		double sum=0;
		double ave;
		
		for(int i=0;i<n;i++){
			System.out.print("要素"+(i+1)+" "); a[i]=stdIn.nextDouble();
		}
		
		for(double i:a){
			sum+=i;
		}
		
		ave=sum/n;
		
		System.out.println("合計値： "+sum);
		System.out.println("平均値： "+ave);
	}
}
