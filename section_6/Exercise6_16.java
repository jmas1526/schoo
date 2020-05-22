import java.util.Scanner;

class Exercise6_16{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		int [][]matrix_1=new int[4][3];
		int [][]matrix_2=new int[3][4];
		int [][]matrix_3=new int[4][3];
		int []sum=new int[4];
		
		//matrix_1
		System.out.println("matrix_1\n");
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print("matrix["+i+"]["+j+"]F");
				matrix_1[i][j]=stdIn.nextInt();
			}
		}
		
		System.out.println();
		
		//matrix_2
		System.out.println("matrix_2\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print("matrix["+i+"]["+j+"]F");
				matrix_2[i][j]=stdIn.nextInt();
			}
		}
		
		System.out.println();
		
		//print matrix_1
		System.out.println("matrix_1\n");
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix_1[i][j]+" ");
			}
			System.out.println();
		}
		
		//print matrix_2
		System.out.println("matrix_2\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(matrix_2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Ï‚ð‹‚ß‚Ü‚·B");
		System.out.println("matrix_3\n");
		
		for(int k=0;k<4;k++){//Row
			
			for(int i=0;i<4;i++){//Column
				
				sum[k]=0;
				for(int j=0;j<3;j++){
					
					sum[k] += matrix_1[i][j]*matrix_2[j][i];
					
				}
				System.out.print(sum[k]+"   ");
			}
			System.out.println();
		}
	}
}

		