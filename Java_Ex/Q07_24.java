import java.util.Scanner;

class Q07_24 {
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
		
		
		System.out.print("削除する要素a[idx]：idx = ");
		int idx = keyboardIn.nextInt();
		
		
		System.out.println("削除します");
		int[] b = arrayRmvOf(a,idx);
		for(int i = 0; i < b.length ; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
	
	public static int[] arrayRmvOf(int[] a, int idx) {
		int[] b = new int[a.length - 1];
		for (int i = 0; i < a.length - 1; i++){
			if(i < idx) b[i] = a[i];
			else b[i] = a[i + 1];
		}
		return b;
	}
}
