import java.util.Scanner;

class Q07_24 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int ma;
		do{
			System.out.print("zñaÌvfF");
			ma = keyboardIn.nextInt();
		}while(ma < 1);
		
		int[] a = new int[ma];
		
		for(int i = 0; i < ma; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		
		System.out.print("í·évfa[idx]Fidx = ");
		int idx = keyboardIn.nextInt();
		
		
		System.out.println("íµÜ·");
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
