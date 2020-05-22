import java.util.Scanner;

class Exercise4_22{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int m;
		
		do{
			System.out.print("ピラミッドを作成します。\n何段？：");
			m=stdIn.nextInt();
		}while(m<1);
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

		
		