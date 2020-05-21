import java.util.Scanner;

class Q07_19 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int m;
		do{
			System.out.print("要素数：");
			m = keyboardIn.nextInt();
		}while(m < 1);
		
		int[] a = new int[m];
		
		for(int i = 0; i < m; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		System.out.print("先頭の値a[idx]：idx = ");
		int idx = keyboardIn.nextInt();
		System.out.print("何個の要素： ");
		int n = keyboardIn.nextInt();
		
		aryRmvN(a, idx, n);
		System.out.println("要素を消去しました。");
		for(int i = 0; i < m ; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
	}
	
	public static void aryRmvN(int[] a, int idx, int n) {
		for (int i = idx; i < a.length - n; i++){
			a[i] = a[i + n];
		}
	}
}
