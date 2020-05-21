import java.util.Scanner;

class Q04_24_r1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("nÅF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		int flag = 1; //1ÇÃÇ∆Ç´ëfêî
		if (n == 1) flag = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) System.out.println(n + "ÇÕëfêî");
		else System.out.println(n + "ÇÕëfêîÇ≈ÇÕÇ»Ç¢");
	}
}
