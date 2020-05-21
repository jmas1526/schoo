import java.util.Scanner;

class Q06_05 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("—v‘f”F");
		int n = keyboardIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		System.out.print("a = {");
		for(int i = 0; i < n - 1; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[n-1] + "}");
	}
}
