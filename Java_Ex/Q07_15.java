import java.util.Scanner;

class Q07_15 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int n;
		do{
			System.out.print("�v�f���F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		
		System.out.print("�v�f�̍��v��" + sumOf(a) + "�ł�");
	}
	
	public static int sumOf(int[] a) {
		int sum = 0;
		for(int m : a){
			sum += m;
		}
		return sum;
	}
}
