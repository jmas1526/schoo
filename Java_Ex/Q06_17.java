import java.util.Scanner;

class Q06_17 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("�_������͂��Ă�������");
		final int[][] score = new int[6][2];//���� [�l][����]
		final String[] subject = {"����","���w"};
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 2; j++){
				System.out.print((i + 1) + "�l�ڂ�" + subject[j] + "�̓_���F");
				score[i][j] = keyboardIn.nextInt();
			}
		}
		//�Ȗڂ���
		for(int j = 0; j < 2; j++){
			double ave = 0;
			for(int i = 0; i < 6; i++){
				ave += score[i][j];
			}
			ave = ave / 6;
			System.out.printf("%s�̕��ϓ_��%.2f�ł��B\n",subject[j], ave);
		}
		//�w������
		for(int i = 0; i < 6; i++){
			double ave = 0;
			for(int j = 0; j < 2; j++){
				ave += score[i][j];
			}
			ave = ave / 2;
			System.out.printf("%d�l�ڂ̕��ϓ_��%.2f�ł��B\n", i + 1, ave);
		}
	}
}
