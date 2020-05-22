import java.util.Scanner;

class Q07_33 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int[] a = makeArray();
		System.out.println();
		int[][] b = makeArray2();
		printArray(a);
		printArray(b);
	}
	
	
	public static void printArray(int[] a){
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i]);
			if(i == a.length-1) break;
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void printArray(int[][] a){
		for (int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j]);
				if(j == a[i].length-1) break;
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	
	public static int[] makeArray(){
		System.out.println("1�����z����쐬���܂�");
		System.out.print("�v�f���F");
		int n = keyboardIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print((i+1) + "�ڂ̐��l�F" );
			a[i] = keyboardIn.nextInt();
		}
		return a;
	}
	
	public static int[][] makeArray2(){
		System.out.println("2�����z����쐬���܂�");
		System.out.print("�s���F");
		int h = keyboardIn.nextInt();
		int[][] a = new int[h][];
		for(int i = 0; i < h; i++) {
			System.out.print((i + 1) + "�s�ڂ̗񐔁F");
			int w = keyboardIn.nextInt();
			a[i] = new int[w];
			for(int j = 0; j < w; j++){
				System.out.print((i+1) + "�s" + (j+1) + "��̐��l�F" );
				a[i][j] = keyboardIn.nextInt();
			}
			System.out.println();
		}
		return a;
	}
}
