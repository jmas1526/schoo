import java.util.Scanner;
import java.util.Random;

class Q06_09 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("—v‘f”F");
		int n = keyboardIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		for(int i = 0; i < n; i++){
			System.out.printf("a[%2d] = %2d\n",i ,a[i]);
		}
	}
}
