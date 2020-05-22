import java.util.Scanner;

class Exercise6_18{
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("行数："); int Row=stdIn.nextInt();
		int []Column=new int[Row];
		int [][]value;
		value=new int[Row][];
		
		for(int i=0;i<Row;i++){
			
			System.out.print(i+1+"行目の列数："); Column[i]=stdIn.nextInt();
			value[i]=new int[Column[i]];
			
		}
		
		System.out.println("\n");
		
		for(int i=0;i<Row;i++){
			for(int j=0;j<Column[i];j++){
				
				System.out.print(i+1+"行目"+(j+1)+"列目の値：");
				value[i][j]=stdIn.nextInt();
				
				System.out.println();
			}
		}
		
		for(int i=0;i<Row;i++){
			for(int j=0;j<Column[i];j++){
				
				System.out.print(value[i][j]+"   ");
				
			}
			
			System.out.println();
			
		}
	}
}
