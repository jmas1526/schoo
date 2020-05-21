import java.util.Scanner;

class Q07_16 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int n;
		do{
			System.out.print("要素数：");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		
		System.out.print("要素の合計は" + minOf(a) + "です");
	}
	
	public static int minOf(int[] a) {
		int min = a[0];
		for(int m : a){
			if(m < min) min = m;
		}
		return min;
	}
}
