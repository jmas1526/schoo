import java.util.Scanner;

class Q07_17 {
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
		
		System.out.print("探す値：");
		int key = keyboardIn.nextInt();
		int ida = linearSearchR(a, key);
		if (ida == -1)
			System.out.println("その値の要素は存在しません。");
		else
			System.out.println("その値はa[" + ida + "]にあります。");
	}
	
	public static int linearSearchR(int[] a, int key) {
		for (int i = a.length-1; i >= 0 ; i--){
			if(a[i] == key) return i;
		}
		return -1;
	}
}
