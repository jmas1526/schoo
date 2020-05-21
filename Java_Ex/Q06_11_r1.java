import java.util.Scanner;
import java.util.Random;

class Q06_11_r1 {
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
		boolean retry;
		for(int i = 1; i < n; i++) {
			do {
				retry = false;
				a[i] = rand.nextInt(10) + 1;
				
				for (int j = 0; j < i; j++){
					if (a[j] == a[i]){
						retry = true;
						break;
					}
				}
				
			}while(retry);
		}
		for(int i = 0; i < n; i++){
			System.out.printf("a[%2d] = %2d\n",i ,a[i]);
		}
	}
}
