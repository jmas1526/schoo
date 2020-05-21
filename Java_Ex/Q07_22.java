import java.util.Scanner;

class Q07_22 {
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
		
		
		System.out.println("配列bにコピーします");
		int[] b = arrayClone(a);
		for(int i = 0; i < b.length ; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
	
	public static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
}
