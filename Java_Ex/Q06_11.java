import java.util.Scanner;
import java.util.Random;

class Q06_11 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		do{
			System.out.print("óvëfêî(10à»â∫)ÅF");
			n = keyboardIn.nextInt();
		}while(n < 1 || n > 10);
		int[] a = new int[n];
		
		a[0] = rand.nextInt(10) + 1;
		int flag = 1;
		for(int i = 1; i < n; i++) {
			do {
				flag = 1;
				a[i] = rand.nextInt(10) + 1;
				for (int j = 0; j < i; j++){
					if (a[j] == a[i]) flag = 0;
				}
			}while(flag == 0);
		}
		for(int i = 0; i < n; i++){
			System.out.printf("a[%2d] = %2d\n",i ,a[i]);
		}
	}
}
