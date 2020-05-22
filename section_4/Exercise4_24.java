import java.util.Scanner;

class Exercise4_24{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int m;
		int sum=0;
		
		do{
			System.out.print("正の整数値：");
			m=stdIn.nextInt();
		}while(m<=0);
		
		for(int i=1;i<=m;i++){
			if (m%i==0){
				sum++;
			}
			if (sum==3){
				break;
			}
			
		}
		if(sum==3 || sum==1){
			System.out.println(m+"は素数ではありません。");
		}else{
			System.out.println(m+"は素数です。");
		}
	}
}
