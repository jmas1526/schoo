import java.util.Scanner;

class Q07_21 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int ma;
		do{
			System.out.print("配列aの要素数：");
			ma = keyboardIn.nextInt();
		}while(ma < 1);
		
		int[] a = new int[ma];
		
		for(int i = 0; i < ma; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		int mb;
		do{
			System.out.print("配列bの要素数：");
			mb = keyboardIn.nextInt();
		}while(mb < 1);
		
		int[] b = new int[mb];
		
		for(int i = 0; i < mb; i++){
			System.out.print("b[" + i + "] = ");
			b[i] = keyboardIn.nextInt();
		}
		
		System.out.println("全要素を交換します");
		aryExchng(a, b);
		for(int i = 0; i < ma ; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for(int i = 0; i < mb ; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
	
	public static void aryExchng(int[] a, int[] b) {
		int minLen = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < minLen; i++){
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
}
