import java.util.Scanner;

class Q04_24_r1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("n�F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int flag = 1; //1�̂Ƃ��f��
		if (n == 1) flag = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) System.out.println(n + "�͑f��");
		else System.out.println(n + "�͑f���ł͂Ȃ�");
	}
}
