import java.util.Scanner;

class Q06_19 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		
		//�N���X������
		System.out.print("�N���X���F");
		int c = keyboardIn.nextInt();
		
		double[][] sumave = new double[2][c];
		int people = 0;
		//�l���Ɠ_������
		int[][] score = new int[c][];
		for(int i = 0; i < c; i++) {
			System.out.print((i + 1) + "�g�̐l���F");
			int num = keyboardIn.nextInt();
			score[i] = new int[num];
			people += num;
			
			//�_�����͂ƍ��v�v�Z
			double sum =0;
			for(int j = 0; j < num; j++){
				System.out.print((i + 1) + "�g" + (j + 1) + "�Ԃ̓_���F");
				score[i][j] = keyboardIn.nextInt();
				sum += score[i][j];
			}
			System.out.println();
			
			//�g���Ƃ̍��v�ƕ��ς��i�[
			double ave = sum / num;
			sumave[0][i] = sum;
			sumave[1][i] = ave;
			
		}
		
		
		System.out.printf("  �g | ���v  ����\n");
		System.out.printf("-----+------------\n");
		//�N���X���Ƃ̍��v�ƕ���
		for(int i = 0; i < c; i++) {
			System.out.printf("%2d�g |%5.0f %5.1f\n",i + 1 ,sumave[0][i] ,sumave[1][i]);
		}
		
		//�S�̂̍��v�ƕ���
		double Sum = 0;
		for(double sum : sumave[0]) {
			Sum += sum;
		}
		double Ave = Sum;
		
		Ave /= people;
		
		System.out.printf("-----+------------\n");
		System.out.printf("  �v |%5.0f %5.1f\n",Sum ,Ave);
		
	}
}
