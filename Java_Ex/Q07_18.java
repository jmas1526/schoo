import java.util.Scanner;

class Q07_18 {
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
		
		System.out.print("消す値a[idx]：idx = ");
		int idx = keyboardIn.nextInt();
		
		aryRmv(a, idx);
		System.out.println("要素を消去しました。");
		for(int i = 0; i < n ; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
	}
	
	public static void aryRmv(int[] a, int idx) {
		for (int i = idx; i < a.length - 1; i++){
			a[i] = a[i + 1];
		}
	}
}
