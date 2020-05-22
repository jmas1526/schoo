import java.util.Scanner;

class Exercise4_21{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//左上直角三角形
		
		int l;
		
		do{
			System.out.print("左上直角の三角形を作成します。\n何段？：");
			l=stdIn.nextInt();
		}while(l<=1);
		
		for(int i=l;i>0;i--){
			for(int j=l;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
			l--;
		}
		
		
		//右下直角三角形
		
		int m;
		
		do{
			System.out.print("右下直角の三角形を作成します。\n何段？：");
			m=stdIn.nextInt();
		}while(m<=1);
		
		for(int i=0;i<m;i++){
			for(int j=m-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//右上直角三角形
		
		int n;
		
		do{
			System.out.print("右上直角の三角形を作成します。\n何段？：");
			n=stdIn.nextInt();
		}while(n<=1);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
