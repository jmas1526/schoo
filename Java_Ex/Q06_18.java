import java.util.Scanner;

class Q06_18 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		
		//�s������
		System.out.print("�s���F");
		int h = keyboardIn.nextInt();
		
		//�񐔓���
		int[][] c = new int[h][];
		for(int i = 0; i < h; i++) {
			System.out.print((i + 1) + "�s�ڂ̗񐔁F");
			int j = keyboardIn.nextInt();
			c[i] = new int[j];
		}
		
		//�v�f�̓���
		for(int i = 0; i < h; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.print((i + 1) + "�s�ڂ�" + (j + 1) + "��̗v�f�F");
				c[i][j] = keyboardIn.nextInt();
			}
		}
		
		//�o��
		System.out.println("c = ");
		for(int i = 0; i < h; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("%4d",c[i][j]);
			}
			System.out.println();
		}
	}
}
