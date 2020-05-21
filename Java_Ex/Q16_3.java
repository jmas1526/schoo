import java.util.Scanner;
public class Q16_3 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int num = keyboardIn.nextInt();
		
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]�F");
			x[i] = keyboardIn.nextInt();
		}
		keyboardIn.close();
		
		//����Null
		x = null;
		
		reverse(x);
		
		System.out.println("�v�f�̕��т𔽓]���܂����B");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++) {
				swap(a,i,a.length - i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (NullPointerException e) {
			System.out.println("�Q�Ɛ�:" + e.getMessage());
			System.out.println("�v���O�������I�����܂��B");
			System.exit(2);
		}
	}

}
