import java.util.Scanner;

class Q07_23 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int ma;
		do{
			System.out.print("�z��a�̗v�f���F");
			ma = keyboardIn.nextInt();
		}while(ma < 1);
		
		int[] a = new int[ma];
		
		for(int i = 0; i < ma; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = keyboardIn.nextInt();
		}
		
		System.out.print("�T������l�F");
		int x = keyboardIn.nextInt();
		
		
		System.out.println("�Y���C���f�b�N�X�z���\�����܂�");
		int[] b = arraySrchIdx(a,x);
		for(int i = 0; i < b.length ; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
	
	public static int[] arraySrchIdx(int[] a, int x) {
		int[] copy = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i] == x){
				copy[count] = i;
				count++;
			}
		}
		int[] b = new int[count];
		for (int i = 0; i < count; i++){
			b[i] = copy[i];
		}
		
		return b;
	}
}
