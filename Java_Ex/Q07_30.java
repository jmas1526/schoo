import java.util.Scanner;

class Q07_30 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		//配列の作成
		System.out.println("配列を作成します");
		int n;
		do{
			System.out.print("配列の要素数：");
			n = keyboardIn.nextInt();
		}while(n < 1);
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		
		System.out.println("min(a[0],a[1]) = " + min(a[0],a[1]));
		System.out.println("min(a[0],a[1],a[2]) = " + min(a[0],a[1],a[2]));
		System.out.println("min(a[]) = " + min(a));
	}
	
	
	public static int min(int a,int b){
		int min = a < b ? a : b;
		return min;
	}
	public static int min(int a,int b, int c){
		int min = a < b ? a : b;
		min = min < c ? min : c;
		return min;
	}
	public static int min(int[] a){
		int min = a[0];
		for(int i = 1; i < a.length; i++){
			min = min < a[i] ? min : a[i];
		}
		return min;
	}
}
