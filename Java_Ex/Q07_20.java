import java.util.Scanner;

class Q07_20 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int m;
		do{
			System.out.print("�v�f���F");
			m = keyboardIn.nextInt();
		}while(m < 1);
		
		int[] a = new int[m];
		
		for(int i = 0; i < m; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		System.out.print("�}���ꏊa[idx]�Fidx = ");
		int idx = keyboardIn.nextInt();
		System.out.print("�}������l�F");
		int x = keyboardIn.nextInt();
		
		aryIns(a, idx, x);
		System.out.println("�v�f��}�����܂����B");
		for(int i = 0; i < m ; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
	}
	
	public static void aryIns(int[] a, int idx, int x) {
		for (int i = a.length - 1; i > idx; i--){
			a[i] = a[i - 1];
		}
		a[idx] = x;
	}
}
