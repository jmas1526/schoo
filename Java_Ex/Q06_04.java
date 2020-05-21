import java.util.Scanner;
import java.util.Random;

class Q06_04 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("óvëfêîÅF");
		int n = keyboardIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = rand.nextInt(10) + 1;
		}
		
		
		for(int row = 0; row < 10; row++) {
			for(int i = 0; i < a.length; i++) {
				if(a[i] >= 10-row) {
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
				System.out.println();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.print(i % 10);
		}
	}
}
