import java.util.Scanner;

class Q07_11 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("�����F");
		int n = keyboardIn.nextInt();
		System.out.print("�V�t�g��(��:+, �E:-)�F");
		int i = keyboardIn.nextInt();
		
		int tmp =1;
		
		
		if(i >= 0) {
			tmp = pow(2,i);
			System.out.println(tmp + "�{���܂��B");
			n = n << i;
		}else{
			tmp = pow(2,-i);
			System.out.println("1/" + tmp + "�{���܂��B");
			n = n >> -i;
		}
		
		System.out.println("���ʁF" + n);
	}
	
	public static int pow(int n, int e) {
		int tmp = 1;
		for (; e > 0; e--){
			tmp *= n;
		}
		return tmp;
	}
}
