import java.util.Scanner;

class Q07_17 {
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
		
		System.out.print("�T���l�F");
		int key = keyboardIn.nextInt();
		int ida = linearSearchR(a, key);
		if (ida == -1)
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		else
			System.out.println("���̒l��a[" + ida + "]�ɂ���܂��B");
	}
	
	public static int linearSearchR(int[] a, int key) {
		for (int i = a.length-1; i >= 0 ; i--){
			if(a[i] == key) return i;
		}
		return -1;
	}
}
