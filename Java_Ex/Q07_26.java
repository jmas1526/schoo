import java.util.Scanner;

class Q07_26 {
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
		
		
		System.out.print("挿入する位置a[idx]：idx = ");
		int idx = keyboardIn.nextInt();
		System.out.print("挿入する値：");
		int x = keyboardIn.nextInt();
		
		System.out.println("挿入します");
		int[] b = arrayInsOf(a,idx,x);
		for(int i = 0; i < b.length ; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
	
	
	public static int[] arrayInsOf(int[] a, int idx, int x) {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < b.length; i++){
			if(i < idx) b[i] = a[i];
			else b[i] = a[i - 1];
		}
		b[idx] = x;
		return b;
	}
}
