import java.util.Scanner;

class Q06_16 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("�s��̗v�f����͂��Ă�������");
		
		final int[][] a = new int[4][3];//����
		final int[][] b = new int[3][4];//����
		final int[][] c = new int[4][4];//�o��
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = keyboardIn.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = keyboardIn.nextInt();
			}
		}
		
		//�s��v�Z
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 3; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		//���ʕ\��
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.printf("%3d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}
