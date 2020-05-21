import java.util.Scanner;
import java.util.Random;

class Q06_12 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		do{
			System.out.print("�v�f���F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		int[] aIn = new int[n];
		int[] aOut = new int[n];
		int[] r = new int[n];
		
		//���̔z��쐬
		aIn[0] = rand.nextInt(n) + 1;
		for(int i = 1; i < n; i++) {
			aIn[i] = rand.nextInt(n) + 1;
		}
		for(int i = 0; i < n; i++){
			System.out.printf("aIn[%2d] = %2d\n",i ,aIn[i]);
		}
		
		//�V���b�t������ꏊ�̔z��
		r[0] = rand.nextInt(n);
		boolean retry;
		for(int i = 1; i < n; i++) {
			do {
				retry = false;
				r[i] = rand.nextInt(n);
				for (int j = 0; j < i; j++){
					if (r[j] == r[i]) retry = true;
				}
			}while(retry);
		}
		
		//�o�͔z��
		for(int i = 0; i < n; i++) {
			aOut[i] = aIn[r[i]];
		}
		for(int i = 0; i < n; i++){
			System.out.printf("aOut[%2d] = %2d\n",i ,aOut[i]);
		}
	}
}
