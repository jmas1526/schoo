import java.util.Scanner;
import java.util.Random;

class Q06_13 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		do{
			System.out.print("�v�f���F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		int[] a = new int[n];
		int[] b = new int[n];
		
		//���̔z��쐬
		a[0] = rand.nextInt(n) + 1;
		for(int i = 1; i < n; i++) {
			a[i] = rand.nextInt(n) + 1;
		}
		for(int i = 0; i < n; i++){
			System.out.printf("a[%2d] = %2d\n",i ,a[i]);
		}
		
		
		System.out.println();
		//�o�͔z��
		for(int i = 0; i < n; i++) {
			b[i] = a[n - 1 - i];
		}
		for(int i = 0; i < n; i++){
			System.out.printf("b[%2d] = %2d\n",i ,b[i]);
		}
	}
}
