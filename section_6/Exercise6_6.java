import java.util.Scanner;

class Exercise6_6{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("受験人数：");
		int n=stdIn.nextInt();
		
		int []score =new int[n];
		
		//read
		for(int i=0;i<n;i++){
			System.out.print(i+1+"番の点数：");  score[i]=stdIn.nextInt();
		}
		
		System.out.println();
		
		//print score
		int sum=0;
		double ave;
		int Max=score[0];
		int Min=score[0];
		
		for(int i=0;i<n;i++){
			
			sum+=score[i];
			
			if(score[i]>Max){
				Max=score[i];
			}
			
			if(score[i]<Min){
				Min=score[i];
			}
		}
		
		ave=(double)sum/n;
		
		System.out.println("合計点："+sum);
		System.out.println("平均点："+ave);
		System.out.println("最高点："+Max);
		System.out.println("最低点："+Min);
		
	}
}

		